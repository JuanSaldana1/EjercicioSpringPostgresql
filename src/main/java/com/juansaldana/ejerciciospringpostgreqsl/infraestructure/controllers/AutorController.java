package com.juansaldana.ejerciciospringpostgreqsl.infraestructure.controllers;

import com.juansaldana.ejerciciospringpostgreqsl.domain.Autor;
import com.juansaldana.ejerciciospringpostgreqsl.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AutorController {
  @Autowired private AutorService autorService;

  // Añadir autor
  @PostMapping(
      path = "/addAutor",
      consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Autor> addAutor(@RequestBody Autor newAutor) {
    Autor addedAutor = autorService.guardarAutor(newAutor);
    return new ResponseEntity<>(addedAutor, HttpStatus.OK);
  }

  // Mostrar autor por id
  @GetMapping("/getAutor/{id}")
  public ResponseEntity<Autor> findById(@PathVariable Integer id) {
    Autor autor = autorService.findById(id);
    return new ResponseEntity<>(autor, HttpStatus.OK);
  }

  // Editar autor por id
  @PutMapping(
      path = "/modifyAutor/{id}",
      consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Autor> modifyAutorById(
      @PathVariable Integer id, @RequestBody Autor newAutor) {
    Autor modifiedAutor = autorService.modifyAutor(id, newAutor);
    return new ResponseEntity<>(modifiedAutor, HttpStatus.OK);
  }

  // Eliminar autor por id
  @DeleteMapping(path = "/deleteAutor")
  public ResponseEntity<Response> deleteAutor(@PathVariable Integer id) {
    autorService.eliminarAutorPorId(id);
    return new ResponseEntity<>(Response.noErrorResponse(), HttpStatus.OK);
  }
}
