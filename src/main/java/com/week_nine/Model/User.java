package com.week_nine.Model;

import lombok.*;

import javax.persistence.*;

@Builder
@Entity
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "user_tbl",
                uniqueConstraints = @UniqueConstraint(name = "email_unique",
                columnNames = "email"))
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    private String firstName;

    private String lastName;

    private String gender;

    private String phoneNumber;

    private String email;

    private String role;

    private String password;
}