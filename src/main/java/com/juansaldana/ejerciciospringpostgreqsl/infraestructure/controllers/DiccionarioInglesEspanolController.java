package com.juansaldana.ejerciciospringpostgreqsl.infraestructure.controllers;

import com.juansaldana.ejerciciospringpostgreqsl.service.DiccionarioInglesEspanolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiccionarioInglesEspanolController {
  @Autowired DiccionarioInglesEspanolService diccionarioInglesEspanolService;

  // Crear palabra en el diccionario
  /*@PostMapping(path = "/addPalabraIngles", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<InglesOutputDto> addPalabraIngles(@RequestBody InglesInputDto nuevaPalabra) {
      InglesOutputDto inglesOutputDto = diccionarioInglesEspanolService.guardarDiccionarioInglesEspanol(nuevaPalabra);
      return new ResponseEntity<>(inglesOutputDto, HttpStatus.ACCEPTED);
  }*/
}
