package com.juansaldana.ejerciciospringpostgreqsl.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class DiccionarioEspanolIngles {
    @Id
    private Integer id;

    private String palabra;
    private String descripcion;
    private Date fechaAlta;
    private Date fechaModificacion;
    private boolean activo;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<DiccionarioInglesEspanol> palabrasEspanol = new ArrayList<>();
}