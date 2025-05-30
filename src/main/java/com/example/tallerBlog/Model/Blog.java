package com.example.tallerBlog.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String categoria;
    private String contenido;
    private String fechaPublicacion;

    public Blog() {
    }

    public Blog(Long id, String titulo, String categoria, String contenido, String fechaPublicacion) {
        this.id = id;
        this.titulo = titulo;
        this.categoria = categoria;
        this.contenido = contenido;
        this.fechaPublicacion = fechaPublicacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCotenido() {
        return contenido;
    }

    public void setCotenido(String cotenido) {
        this.contenido = cotenido;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
}
