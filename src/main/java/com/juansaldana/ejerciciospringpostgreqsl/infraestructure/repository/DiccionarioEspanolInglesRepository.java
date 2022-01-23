package com.juansaldana.ejerciciospringpostgreqsl.infraestructure.repository;

import com.juansaldana.ejerciciospringpostgreqsl.domain.DiccionarioEspanolIngles;
import com.juansaldana.ejerciciospringpostgreqsl.domain.DiccionarioInglesEspanol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiccionarioEspanolInglesRepository extends JpaRepository<DiccionarioEspanolIngles, String> {
}