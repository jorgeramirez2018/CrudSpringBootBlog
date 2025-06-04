package com.example.tallerBlog.Autor.Model;

import com.example.tallerBlog.Blog.Model.Blog;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "autor")
public class AutorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_autor;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String email;

    @OneToMany(mappedBy = "autor",cascade = CascadeType.ALL)

    private List<Blog> BlogPost = new ArrayList<>();


    public AutorModel(Long id_autor, String nombre, String email, List<Blog> blogPost) {
        this.id_autor = id_autor;
        this.nombre = nombre;
        this.email = email;
        BlogPost = blogPost;
    }

    public List<Blog> getBlogPost() {
        return BlogPost;
    }

    public void setBlogPost(List<Blog> blogPost) {
        BlogPost = blogPost;
    }

    public AutorModel() {
    }


    public Long getId_autor() {
        return id_autor;
    }

    public void setId_autor(Long id_autor) {
        this.id_autor = id_autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
