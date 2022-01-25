package com.juansaldana.ejerciciospringpostgreqsl.service;

import com.juansaldana.ejerciciospringpostgreqsl.infraestructure.repository.DiccionarioInglesEspanolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiccionarioInglesEspanolService {
  @Autowired DiccionarioInglesEspanolRepository diccionarioInglesEspanolRepository;

  /*public DiccionarioInglesEspanol guardarDiccionarioInglesEspanol(InglesInputDto diccionarioInglesEspanol) {
      InglesSimpleOutputDto inglesSimpleOutputDto = new InglesSimpleOutputDto();
      return diccionarioInglesEspanolRepository.save(diccionarioInglesEspanol);
  }*/
}
