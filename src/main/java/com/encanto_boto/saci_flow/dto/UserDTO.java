package com.encanto_boto.saci_flow.dto;

import java.util.List;

public class UserDTO {
    private String username;

    // Classe para mostrar apenas o usuário no findAllByUser do TaskService
    public UserDTO(String username) {
        this.username = username;
    }

    // GETTERS AND SETTERS

    // Usuário
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
}
