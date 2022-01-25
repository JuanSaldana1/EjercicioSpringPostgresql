package com.juansaldana.ejerciciospringpostgreqsl.infraestructure.controllers;

<<<<<<< HEAD
import com.juansaldana.ejerciciospringpostgreqsl.domain.DiccionarioEspanolIngles;
import com.juansaldana.ejerciciospringpostgreqsl.infraestructure.controllers.dto.input.EspanolInputDto;
import com.juansaldana.ejerciciospringpostgreqsl.infraestructure.controllers.dto.output.EspanolSimpleOutputDto;
import com.juansaldana.ejerciciospringpostgreqsl.service.DiccionarioInglesEspanolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
=======
import com.juansaldana.ejerciciospringpostgreqsl.service.DiccionarioInglesEspanolService;
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> origin/master
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiccionarioEspanolInglesController {
  @Autowired DiccionarioInglesEspanolService diccionarioInglesEspanolService;
<<<<<<< HEAD

  // Añadir palabra en español al diccionario
  @PostMapping("/addPalabraEspanol")
  public ResponseEntity<EspanolSimpleOutputDto> addPalabraEspanol(
      @PathVariable EspanolInputDto espanolInputDto) {
    EspanolSimpleOutputDto espanolSimpleOutputDto = new EspanolSimpleOutputDto();
    DiccionarioEspanolIngles diccionarioEspanolIngles = new DiccionarioEspanolIngles();
    espanolSimpleOutputDto.setPalabra(espanolInputDto.toString());
    return new ResponseEntity<>(espanolSimpleOutputDto, HttpStatus.OK);
  }
=======
>>>>>>> origin/master
}
