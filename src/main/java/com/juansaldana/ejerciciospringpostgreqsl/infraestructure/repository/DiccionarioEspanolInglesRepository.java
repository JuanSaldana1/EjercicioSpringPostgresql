package com.juansaldana.ejerciciospringpostgreqsl.infraestructure.repository;

import com.juansaldana.ejerciciospringpostgreqsl.domain.DiccionarioEspanolIngles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiccionarioEspanolInglesRepository
    extends JpaRepository<DiccionarioEspanolIngles, String> {}
