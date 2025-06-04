package com.example.tallerBlog.Comentario.Model;

import jakarta.persistence.*;

@Entity
public class ComentarioModel {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id_comentario;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String text;

    @Column(nullable = false)
    private String  createdAt;

    public ComentarioModel() {
    }

    public ComentarioModel(Long id_comentario, String text, String createdAt) {
        this.id_comentario = id_comentario;
        this.text = text;
        this.createdAt = createdAt;
    }

    public Long getId_comentario() {
        return id_comentario;
    }

    public void setId_comentario(Long id_comentario) {
        this.id_comentario = id_comentario;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
