package com.example.tallerBlog.Controller;

import com.example.tallerBlog.Model.Blog;
import com.example.tallerBlog.Services.BlogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/blogs")
public class BlogController{

    private final BlogService blogservice;
    @Autowired
    public BlogController(BlogService blogservice) {
        this.blogservice = blogservice;
    }

    @GetMapping
    public List<Blog> obtenerDatos(){
        return blogservice.obtenerDatos();
    }

    @GetMapping("/{id}")
    public Optional<Blog> obtenerID(@PathVariable("id") Long id) {
        return blogservice.obtenerID(id);
    }

    @PostMapping
    public ResponseEntity<String> guardarBlog(@RequestBody Blog blog) {
        blogservice.guardarBlog(blog);
        return ResponseEntity.ok("Blog guardada exitosamente");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> eliminarBlog(@PathVariable("id") Long id){
        blogservice.deleteBlog(id);
        return ResponseEntity.ok("Blog eliminado con exito");
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<String> actualizarProducto(@PathVariable Long id, @RequestBody Blog blogActualizdo) {
        blogservice.editarBlog(id,blogActualizdo);
        return ResponseEntity.ok("Blog actualizado");
    }

}
