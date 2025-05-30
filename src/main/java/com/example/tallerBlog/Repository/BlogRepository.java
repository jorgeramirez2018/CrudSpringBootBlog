package com.example.tallerBlog.Repository;

import com.example.tallerBlog.Model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BlogRepository extends JpaRepository<Blog,Long > {

;
}
