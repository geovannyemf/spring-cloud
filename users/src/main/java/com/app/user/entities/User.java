package com.app.user.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private Boolean enable;
    
    @JsonIgnoreProperties({"handler","hibernateInitializer"})
    @ManyToMany
    @JoinTable(
    		name="users_roles",
    		joinColumns = {@JoinColumn(name="user_id")},
    		inverseJoinColumns = {@JoinColumn(name="role_id")},
    		uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id","role_id"})}
    		
    		) 
    private List<Role> roles;
}
