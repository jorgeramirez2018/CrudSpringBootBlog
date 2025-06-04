package com.example.tallerBlog.Autor.Service;

import com.example.tallerBlog.Autor.Model.AutorModel;

import java.util.List;
import java.util.Optional;

public interface AutorServiceInterface {

   public List<AutorModel> obtenerDatos();
   public Optional<AutorModel> obtenerId(Long id);
   public String guardarDatos (AutorModel guaradarDatos);
   public void eliminarDatos(Long id);
   public void editarDatos(Long id, AutorModel actualizarDatos);
}
