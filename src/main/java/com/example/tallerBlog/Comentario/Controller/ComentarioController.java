package com.example.tallerBlog.Comentario.Controller;

import com.example.tallerBlog.Comentario.Model.ComentarioModel;
import com.example.tallerBlog.Comentario.Service.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {

    private final ComentarioService comentarioservice;
    @Autowired
    public ComentarioController(ComentarioService comentarioservice) {
        this.comentarioservice = comentarioservice;
    }
    @GetMapping
    public List<ComentarioModel> obtenerDatos(){
        return comentarioservice.obtenerDatos();
    }
    @GetMapping("/{id}")
    public Optional<ComentarioModel> obtenerPorId(@PathVariable  Long id){
        return comentarioservice.obtenerId(id);
    }

    @PostMapping("guardarDatos")
    public ResponseEntity<String> guardarDatos (@RequestBody ComentarioModel guardarDatos){
        comentarioservice.guardarDatos(guardarDatos);
        return ResponseEntity.ok("Datos guardados correctamente");
    }

    @DeleteMapping("borrarDatos/{id}")
    public ResponseEntity<String> borrarDatos(@PathVariable Long id){
        comentarioservice.eliminarDatos(id);
        return ResponseEntity.ok("Datos eliminados correctamente");
    }

    @PutMapping("actualizarDatos/{id}")
    public ResponseEntity<String> actualizarDatos(@PathVariable Long id, @RequestBody ComentarioModel actualizar){
        comentarioservice.editarDatos(id,actualizar);
        return ResponseEntity.ok("Datos Actualizados correctamente");
    }


}
