package com.juansaldana.ejerciciospringpostgreqsl.infraestructure.controllers;

import com.juansaldana.ejerciciospringpostgreqsl.domain.Editorial;
import com.juansaldana.ejerciciospringpostgreqsl.service.EditorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EditorialController {
    @Autowired
    private EditorialService editorialService;

    // Añadir editorial
    @PostMapping(path = "/addEditorial", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Editorial> addEditorial(@RequestBody Editorial newEditorial) {
        Editorial addedEditorial = editorialService.guardarEditorial(newEditorial);
        return new ResponseEntity<>(addedEditorial, HttpStatus.OK);
    }

    // Mostrar todas las editoriales
    @GetMapping("/getAllEditoriales")
    public ResponseEntity<List<Editorial>> getAll() {
        List<Editorial> editoriales;
        editoriales = editorialService.findAll();
        return new ResponseEntity<>(editoriales, HttpStatus.OK);
    }

    // Mostrar editorial por id
    @GetMapping("/getEditorial/{id}")
    public ResponseEntity<Editorial> findById(@PathVariable Integer id) {
        Editorial editorial = editorialService.findById(id);
        return new ResponseEntity<>(editorial, HttpStatus.OK);
    }

    // Editar editorial

    // Eliminar editorial por id
    @DeleteMapping("/deleteEditorial/{id}")
    public ResponseEntity<Response> deleteEditorial(@PathVariable Integer id) {
        editorialService.eliminarEditorial(id);
        return new ResponseEntity<>(Response.noErrorResponse(), HttpStatus.OK);
    }
}