package com.example.tallerBlog.Autor.Repository;

import com.example.tallerBlog.Autor.Model.AutorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<AutorModel, Long> {
}
