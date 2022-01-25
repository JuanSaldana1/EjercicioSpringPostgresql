package com.juansaldana.ejerciciospringpostgreqsl.service;

<<<<<<< HEAD
import com.juansaldana.ejerciciospringpostgreqsl.domain.DiccionarioEspanolIngles;
=======
import com.juansaldana.ejerciciospringpostgreqsl.domain.Autor;
import com.juansaldana.ejerciciospringpostgreqsl.domain.DiccionarioEspanolIngles;
import com.juansaldana.ejerciciospringpostgreqsl.infraestructure.controllers.dto.output.EspanolOutputDto;
import com.juansaldana.ejerciciospringpostgreqsl.infraestructure.repository.AutorRepository;
>>>>>>> origin/master
import com.juansaldana.ejerciciospringpostgreqsl.infraestructure.repository.DiccionarioEspanolInglesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
<<<<<<< HEAD

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
=======
import java.util.NoSuchElementException;

@Service
public class DiccionarioEspanolInglesService {
    @Autowired
    private DiccionarioEspanolInglesRepository diccionarioEspanolInglesRepository;

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
>>>>>>> origin/master
