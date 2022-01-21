package com.juansaldana.ejerciciospringpostgreqsl.domain;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class DiccionarioInglesEspanol {
    @Id
    private int id;

    private int idPalabraEspanol;
    private String palabra;
    private Date fechaAlta;
    private Date fechaModificacion;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<DiccionarioEspanolIngles> palabrasIngles = new ArrayList<>();
}