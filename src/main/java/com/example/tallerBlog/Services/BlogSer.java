package com.example.tallerBlog.Services;

import com.example.tallerBlog.Model.Blog;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface BlogSer {
    List<Blog> obtenerDatos();
    Optional<Blog> obtenerID(Long ID);
    ResponseEntity<String> guardarBlog(Blog blog);
    void deleteBlog(Long id);
    void editarBlog(Long id, Blog blogactualizado);

}
