package com.juansaldana.ejerciciospringpostgreqsl.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Component
@Data
@Entity
@Table
public class Autor {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String nombre;
  private String pais;
  private String poblacion;

  @JsonBackReference @OneToMany List<Editorial> editoriales;
}
