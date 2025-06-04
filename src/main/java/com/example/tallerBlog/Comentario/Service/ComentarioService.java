package com.example.tallerBlog.Comentario.Service;

import com.example.tallerBlog.Comentario.Model.ComentarioModel;
import com.example.tallerBlog.Comentario.Repository.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ComentarioService implements ComentarioServiceInterface{
    private final ComentarioRepository comentariorepository;

    @Autowired
    public ComentarioService(ComentarioRepository comentariorepository) {
        this.comentariorepository = comentariorepository;
    }


    @Override
    public List<ComentarioModel> obtenerDatos() {
        return comentariorepository.findAll();
    }

    @Override
    public Optional<ComentarioModel> obtenerId(Long id) {
        return comentariorepository.findById(id);
    }

    @Override
    public String guardarDatos(ComentarioModel guaradarDatos) {
        comentariorepository.save(guaradarDatos);
        return null;
    }

    @Override
    public void eliminarDatos(Long id) {
         comentariorepository.deleteById(id);
    }

    @Override
    public void editarDatos(Long id, ComentarioModel actualizarDatos) {
     ComentarioModel actualizarComent = comentariorepository.findById(id).orElse(null);

     if(actualizarComent!=null){
         actualizarComent.setText(actualizarDatos.getText());
         actualizarComent.setCreatedAt(actualizarDatos.getCreatedAt());
         comentariorepository.save(actualizarComent);
     }else{
         throw new RuntimeException("No se pudieron actualizar los datos: " + id);
     }
    }
}
