package com.juansaldana.ejerciciospringpostgreqsl.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
    private int idEditorial;

    private String nombre;
    private int numeroPaginas;
    private Date fechaPublicacion;

    @OneToMany
    @ToString.Exclude
    private List<DiccionarioEspanolIngles> diccionarios = new ArrayList<>();
}