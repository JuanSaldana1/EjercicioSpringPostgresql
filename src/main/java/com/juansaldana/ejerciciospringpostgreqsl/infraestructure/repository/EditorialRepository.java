package com.juansaldana.ejerciciospringpostgreqsl.infraestructure.repository;

import com.juansaldana.ejerciciospringpostgreqsl.domain.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditorialRepository extends JpaRepository<Editorial, Integer> {
}