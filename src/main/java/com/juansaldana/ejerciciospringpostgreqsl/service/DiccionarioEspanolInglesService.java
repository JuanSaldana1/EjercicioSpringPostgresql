package com.juansaldana.ejerciciospringpostgreqsl.service;

import com.juansaldana.ejerciciospringpostgreqsl.domain.DiccionarioEspanolIngles;
import com.juansaldana.ejerciciospringpostgreqsl.infraestructure.repository.DiccionarioEspanolInglesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiccionarioEspanolInglesService {
  @Autowired private DiccionarioEspanolInglesRepository diccionarioEspanolInglesRepository;

  public List<DiccionarioEspanolIngles> findAll() {
    return diccionarioEspanolInglesRepository.findAll();
  }

  /*public DiccionarioEspanolIngles findById(Integer id) {
      return diccionarioEspanolInglesRepository.findById(id).orElseThrow(NoSuchElementException::new);
  }

  public DiccionarioEspanolIngles guardarAutor(DiccionarioEspanolIngles autor) {
      return diccionarioEspanolInglesRepository.save(autor);
  }

  public void eliminarAutorPorId(Integer id) {
      diccionarioEspanolInglesRepository.deleteById(id);
  }

  // Modificar autor por id
  public DiccionarioEspanolIngles modifyAutor(Integer id, DiccionarioEspanolIngles newAutor) {
      DiccionarioEspanolIngles autor = diccionarioEspanolInglesRepository.getReferenceById(id);
      newAutor.setId(autor.getId());
      return diccionarioEspanolInglesRepository.save(newAutor);
  }*/
}
