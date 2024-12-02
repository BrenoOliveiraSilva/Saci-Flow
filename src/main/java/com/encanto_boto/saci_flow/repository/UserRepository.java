package com.encanto_boto.saci_flow.repository;

import com.encanto_boto.saci_flow.row.mapper.UserRowMapper;
import com.encanto_boto.saci_flow.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UserRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    // Método para criar usuários
    public User createUser(User user) {
        jdbcTemplate.update("INSERT INTO users (username, mail, password) VALUES (?, ?, ?)", user.getUsername(), user.getMail(), user.getPassword());
        return user;
    }

    // Método para buscar todos os usuários

    public List<User> findAll() {
        return jdbcTemplate.query("SELECT * FROM users", new UserRowMapper());
    }

    // Método para buscar um usuário pelo ID
    public User findById(Long id) {
        return jdbcTemplate.queryForObject("SELECT * FROM users WHERE id = ?", new UserRowMapper(), id);
    }

    // Método para buscar um usuário pelo usuário
    public User findByUsername(String username) {
        return jdbcTemplate.queryForObject("SELECT * FROM users WHERE username = ?", new UserRowMapper(), username);
    }

    // Método para buscar um usuário pelo e-mail
    public User findByMail(String mail) {
        return jdbcTemplate.queryForObject("SELECT * FROM users WHERE mail = ?", new UserRowMapper(), mail);
    }

    // Método para editar um usuário pelo ID
    public void updateUser(Long id, String username, String mail, String password) {
        jdbcTemplate.update("UPDATE users SET username = ?, mail = ?, password = ? WHERE id = ?", username, mail, password, id);
    }

    // Método para deletar um usuário pelo ID
    public void deleteById(Long id) {
        jdbcTemplate.update("DELETE FROM users WHERE id = ?", id);
    }

    // Método para deletar todos os usuários
    public void deleteAll() {
        jdbcTemplate.update("DELETE FROM users");
    }
}