package io.matoshri.security.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    private @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
