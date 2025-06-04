package com.example.tallerBlog.Blog.Model;

import com.example.tallerBlog.Autor.Model.AutorModel;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

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

    @ManyToOne
    @JoinColumn(name = "id_autor", nullable = false)
    @JsonBackReference
    private AutorModel autor;

    public Blog() {
    }

    public Blog(Long id, String titulo, String categoria, String contenido, String fechaPublicacion, AutorModel autor) {
        this.id = id;
        this.titulo = titulo;
        this.categoria = categoria;
        this.contenido = contenido;
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
    }

    public AutorModel getAutor() {
        return autor;
    }

    public void setAutor(AutorModel autor) {
        this.autor = autor;
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

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
}
