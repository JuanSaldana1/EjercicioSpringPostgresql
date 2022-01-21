package com.juansaldana.ejerciciospringpostgreqsl.service;

import com.juansaldana.ejerciciospringpostgreqsl.domain.Autor;
import com.juansaldana.ejerciciospringpostgreqsl.infraestructure.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class AutorService {
    @Autowired
    private AutorRepository autorRepository;

    public List<Autor> findAll() {
        return autorRepository.findAll();
    }

    public Autor findById(Integer id) {
        return autorRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public Autor guardarAutor(Autor autor) {
        return autorRepository.save(autor);
    }

    public void eliminarAutorPorId(Integer id){
        autorRepository.deleteById(id);
    }
}