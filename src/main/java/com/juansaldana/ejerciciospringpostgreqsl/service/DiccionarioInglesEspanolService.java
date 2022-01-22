package com.juansaldana.ejerciciospringpostgreqsl.service;

import com.juansaldana.ejerciciospringpostgreqsl.domain.DiccionarioInglesEspanol;
import com.juansaldana.ejerciciospringpostgreqsl.domain.Editorial;
import com.juansaldana.ejerciciospringpostgreqsl.infraestructure.controllers.dto.input.InglesInputDto;
import com.juansaldana.ejerciciospringpostgreqsl.infraestructure.controllers.dto.output.InglesSimpleOutputDto;
import com.juansaldana.ejerciciospringpostgreqsl.infraestructure.repository.DiccionarioInglesEspanolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiccionarioInglesEspanolService {
    @Autowired
    DiccionarioInglesEspanolRepository diccionarioInglesEspanolRepository;

    /*public DiccionarioInglesEspanol guardarDiccionarioInglesEspanol(InglesInputDto diccionarioInglesEspanol) {
        InglesSimpleOutputDto inglesSimpleOutputDto = new InglesSimpleOutputDto();
        return diccionarioInglesEspanolRepository.save(diccionarioInglesEspanol);
    }*/
}