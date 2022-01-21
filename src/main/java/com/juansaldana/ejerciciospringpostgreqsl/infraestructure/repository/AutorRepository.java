package com.juansaldana.ejerciciospringpostgreqsl.infraestructure.repository;

import com.juansaldana.ejerciciospringpostgreqsl.domain.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer> {
    List<Autor> findAutorById(int id);
}