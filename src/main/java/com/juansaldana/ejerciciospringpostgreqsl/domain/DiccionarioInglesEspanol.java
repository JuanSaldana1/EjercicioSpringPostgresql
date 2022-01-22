package com.juansaldana.ejerciciospringpostgreqsl.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
public class DiccionarioInglesEspanol {
    @Id
    private int id;

    private int idPalabraEspanol;
    private String palabra;
    private Date fechaAlta;
    private Date fechaModificacion;

    @ManyToOne(cascade = CascadeType.ALL)
    private DiccionarioEspanolIngles palabrasIngles;
}