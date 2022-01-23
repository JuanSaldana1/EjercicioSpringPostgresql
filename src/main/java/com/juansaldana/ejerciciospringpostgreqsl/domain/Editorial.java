package com.juansaldana.ejerciciospringpostgreqsl.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table
public class Editorial {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idEditorial;

  private String nombre;
  private int numeroPaginas;
  private Date fechaPublicacion;

  /*@JsonBackReference
  @OneToMany
  private List<DiccionarioEspanolIngles> diccionarios = new ArrayList<>();*/
}
