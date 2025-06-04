package com.example.tallerBlog.Comentario.Service;

import com.example.tallerBlog.Autor.Model.AutorModel;
import com.example.tallerBlog.Comentario.Model.ComentarioModel;

import java.util.List;
import java.util.Optional;

public interface ComentarioServiceInterface {
    public List<ComentarioModel> obtenerDatos();
    public Optional<ComentarioModel> obtenerId(Long id);
    public String guardarDatos (ComentarioModel guaradarDatos);
    public void eliminarDatos(Long id);
    public void editarDatos(Long id, ComentarioModel actualizarDatos);
}
