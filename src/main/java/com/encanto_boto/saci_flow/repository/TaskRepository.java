package com.encanto_boto.saci_flow.repository;

import com.encanto_boto.saci_flow.RowMapper.TaskRowMapper;
import com.encanto_boto.saci_flow.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public class TaskRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    // Método para criar tarefas
    public Task createTask(Task task) {
        task.setCompleted(false);
        LocalDateTime now = LocalDateTime.now();
        task.setCreatedAt(now);
        task.setUpdatedAt(now);
        jdbcTemplate.update("INSERT INTO tasks (title, description, completed, created_at, updated_at) VALUES (?, ?, ?, ?, ?)", task.getTitle(), task.getDescription(), task.isCompleted(), task.getCreatedAt(), task.getUpdatedAt());
        return task;
    }

    // Método para buscar todas as tarefas
    public List<Task> findAll() {
        return jdbcTemplate.query("SELECT * FROM tasks", new TaskRowMapper());
    }

    // Método para buscar uma tarefa pelo ID
    public Task findById(Long id) {
        return jdbcTemplate.queryForObject("SELECT * FROM tasks WHERE id = ?", new TaskRowMapper(), id);
    }

    // Método para editar uma tarefa pelo ID
    public void updateTask(Long id, String title, String description, boolean completed, LocalDateTime createdAt, LocalDateTime updatedAt) {
        jdbcTemplate.update("UPDATE tasks SET title = ?, description = ?, completed = ?, created_at =?,updated_at = ? WHERE id = ?", title, description, completed, createdAt,updatedAt, id);
    }

    // Método para deletar uma tarefa pelo ID
    public void deleteById(Long id) {
        jdbcTemplate.update("DELETE FROM tasks WHERE id = ?", id);
    }

    // Método para deletar todas as tarefas
    public void deleteAll() {
        jdbcTemplate.update("DELETE FROM tasks");
    }
}