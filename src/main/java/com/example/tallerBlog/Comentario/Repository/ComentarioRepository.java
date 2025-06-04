package com.example.tallerBlog.Comentario.Repository;

import com.example.tallerBlog.Comentario.Model.ComentarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComentarioRepository extends JpaRepository<ComentarioModel, Long> {
}
