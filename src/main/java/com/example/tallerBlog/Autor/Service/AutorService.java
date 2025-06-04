package com.example.tallerBlog.Autor.Service;

import com.example.tallerBlog.Autor.Model.AutorModel;
import com.example.tallerBlog.Autor.Repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService implements AutorServiceInterface {
    private final AutorRepository autorrepository;

    @Autowired
    public AutorService(AutorRepository autorrepository) {
        this.autorrepository = autorrepository;
    }

    @Override
    public List<AutorModel> obtenerDatos() {
        return autorrepository.findAll();
    }

    @Override
    public Optional<AutorModel> obtenerId(Long id) {
        return autorrepository.findById(id);
    }

    @Override
    public String guardarDatos(AutorModel guaradarDatos) {
        autorrepository.save(guaradarDatos);
        return null;
    }

    @Override
    public void eliminarDatos(Long id) {

        autorrepository.deleteById(id);

    }

    @Override
    public void editarDatos(Long id, AutorModel actualizarDatos) {

        AutorModel actuaDa = autorrepository.findById(id).orElse(null);

        if(actuaDa!=null){

            actuaDa.setNombre(actualizarDatos.getNombre());
            actuaDa.setEmail(actualizarDatos.getEmail());
            autorrepository.save(actuaDa);

        }else {
            throw new RuntimeException("No se encontro el id del autor" + id);
        }

    }
}
