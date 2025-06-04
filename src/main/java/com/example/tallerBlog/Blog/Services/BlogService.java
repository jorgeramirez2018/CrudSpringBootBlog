package com.example.tallerBlog.Blog.Services;

import com.example.tallerBlog.Blog.Model.Blog;
import com.example.tallerBlog.Blog.Repository.BlogRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class BlogService implements BlogSer{

    private final BlogRepository blogrepository;

    @Autowired
    public BlogService(BlogRepository blogrepository) {
        this.blogrepository = blogrepository;
    }

    @Override
    public List<Blog> obtenerDatos() {
        return blogrepository.findAll();
    }

    @Override
    public Optional<Blog> obtenerID(Long ID) {
        return blogrepository.findById(ID);
    }

    @Override
    public ResponseEntity<String> guardarBlog(Blog blog) {
        blogrepository.save(blog);
        return null;
    }

    @Override
    public void deleteBlog(Long id) {
        blogrepository.deleteById(id);

    }

    @Override
    public void editarBlog(Long id, Blog blogActualizado) {
        Blog blogExistente =  blogrepository.findById(id).orElse(null);

        if (blogExistente !=null){
            blogExistente.setTitulo(blogActualizado.getTitulo());
            blogExistente.setCategoria(blogActualizado.getCategoria());
            blogExistente.setContenido(blogActualizado.getContenido());
            blogrepository.save(blogExistente);
        }else {

            throw new RuntimeException("Blog no encontrada con el id : " + id);
        }

    }

}
