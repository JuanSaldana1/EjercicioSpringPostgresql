package com.juansaldana.ejerciciospringpostgreqsl.service;

import com.juansaldana.ejerciciospringpostgreqsl.domain.Editorial;
import com.juansaldana.ejerciciospringpostgreqsl.infraestructure.repository.EditorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class EditorialService {
  @Autowired private EditorialRepository editorialRepository;

  public List<Editorial> findAll() {
    return editorialRepository.findAll();
  }

  public Editorial findById(Integer id) {
    return editorialRepository.findById(id).orElseThrow(NoSuchElementException::new);
  }

  public Editorial guardarEditorial(Editorial editorial) {
    return editorialRepository.save(editorial);
  }

  public void eliminarEditorialPorId(Integer id) {
    editorialRepository.deleteById(id);
  }
}
