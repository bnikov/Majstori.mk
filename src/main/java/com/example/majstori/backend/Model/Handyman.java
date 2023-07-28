package com.example.majstori.backend.Model;

import com.example.majstori.backend.Model.enumerations.Role;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "Handyman")
@Data
@NoArgsConstructor
public class Handyman implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long handyman_id;

    @Column(nullable = false)
    private String full_name;

    @Column(nullable = false)
    private String email;

    @Column
    private String password;

    @Column
    private String phone_number;

    @Column
    private String bio;

    @Column
    private String profile_picture_url;

    @Column
    private String facebook_link;

    @Column
    private String youtube_link;

    @Column
    private String website_link;

    @ManyToMany
    @JoinTable(name = "Handyman_Category",
            joinColumns = @JoinColumn(name = "handyman_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<Category> categories;

    @OneToMany(mappedBy = "handyman")
    private List<Review> reviews;

    @Enumerated(EnumType.STRING)
    private Role role;
    // ---------------------------------------------------------------

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}

