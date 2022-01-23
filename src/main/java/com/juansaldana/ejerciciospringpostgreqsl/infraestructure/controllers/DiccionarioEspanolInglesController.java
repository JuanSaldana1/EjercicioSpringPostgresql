package com.juansaldana.ejerciciospringpostgreqsl.infraestructure.controllers;

import com.juansaldana.ejerciciospringpostgreqsl.service.DiccionarioInglesEspanolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiccionarioEspanolInglesController {
  @Autowired DiccionarioInglesEspanolService diccionarioInglesEspanolService;
}
