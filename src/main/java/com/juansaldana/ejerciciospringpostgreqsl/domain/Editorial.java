package com.juansaldana.ejerciciospringpostgreqsl.domain;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Editorial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEditorial;

    private String nombre;
    private int numeroPaginas;
    private Date fechaPublicacion;

    @OneToMany
    @ToString.Exclude
    private List<DiccionarioEspanolIngles> diccionarios = new ArrayList<>();
}