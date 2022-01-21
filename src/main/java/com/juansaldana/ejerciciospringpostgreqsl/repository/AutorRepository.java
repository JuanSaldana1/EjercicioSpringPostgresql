package com.juansaldana.ejerciciospringpostgreqsl.repository;

import com.juansaldana.ejerciciospringpostgreqsl.models.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer> {
    List<Autor> findAutorById(int id);
}