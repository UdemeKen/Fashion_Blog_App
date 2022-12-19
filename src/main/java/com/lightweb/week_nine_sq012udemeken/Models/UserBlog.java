package com.lightweb.week_nine_sq012udemeken.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
//        (name = "user_table")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "user_id", nullable = false)
    private Long  user_id;

    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "lastName", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "phoneNumber", nullable = false)
    private String phoneNumber;

    @Column(name = "role", nullable = false)
    private String role;

    @CreationTimestamp
    private LocalDateTime created_date;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Post> posts;
}