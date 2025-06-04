package com.example.tallerBlog.Autor.Controller;

import com.example.tallerBlog.Autor.Model.AutorModel;
import com.example.tallerBlog.Autor.Service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autor")
public class AutorController {
    private final AutorService autorservice;
    @Autowired
    public AutorController(AutorService autorservice) {
        this.autorservice = autorservice;
    }
     @GetMapping
    public List<AutorModel> obtenerDatos(){
       return autorservice.obtenerDatos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> obtenerId(@PathVariable("id") Long id){
        autorservice.obtenerId(id);
        return ResponseEntity.ok("Se obtuvo el id correctramente ");
    }

    @PostMapping("/guardardatos")
    public ResponseEntity<String>GuardarDatos(@RequestBody AutorModel guardarDatos){
        autorservice.guardarDatos(guardarDatos);
        return ResponseEntity.ok("Datos guardados correctamente");
    }
    @DeleteMapping("/borrarDatos/{id}")
    public ResponseEntity<String> eliminarDatos(@PathVariable Long id){
        autorservice.eliminarDatos(id);
        return ResponseEntity.ok("Datos eliminados correctamente");
    }

    @PutMapping("/actualizarDatos/{id}")
    public ResponseEntity<String> actualizarDatos(@PathVariable Long id, @RequestBody AutorModel actualizarDatos){
        autorservice.editarDatos(id,actualizarDatos);
        return ResponseEntity.ok("Datos actualizados correctamente");
    }
}
