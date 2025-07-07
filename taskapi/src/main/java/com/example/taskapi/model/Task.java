package com.example.taskapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tasks") // (opcional) Define el nombre de la tabla si quieres evitar problemas de pluralización automática
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false) // Opcional: asegura que el campo no sea null
    private String title;

    private String description;

    @Column(nullable = false)
    private boolean completed = false;

    // Constructor vacío requerido por JPA
    public Task() {
    }

    // Constructor con campos
    public Task(String title, String description, boolean completed) {
        this.title = title;
        this.description = description;
        this.completed = completed;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
