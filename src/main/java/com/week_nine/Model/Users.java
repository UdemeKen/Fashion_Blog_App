package com.week_nine.Model;

import lombok.*;

import javax.persistence.*;

@Entity(name = "Users")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String email;

    private String role;

    private String password;
}