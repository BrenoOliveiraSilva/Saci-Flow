package com.encanto_boto.saci_flow.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String mail;
    private String password;

    // GETTERS AND SETTERS

    // ID
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    // Usuário
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    // E-mail
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }

    // Senha
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
