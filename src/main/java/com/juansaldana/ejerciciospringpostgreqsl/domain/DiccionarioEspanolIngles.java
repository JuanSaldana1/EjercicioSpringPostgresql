package com.juansaldana.ejerciciospringpostgreqsl.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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
public class DiccionarioEspanolIngles {
    @Id
    private Integer id;

    private String palabra;
    private String descripcion;
    private Date fechaAlta;
    private Date fechaModificacion;
    private boolean activo;

    @JsonManagedReference
    @ManyToMany(cascade = CascadeType.ALL)
    private List<DiccionarioInglesEspanol> palabrasEspanol = new ArrayList<>();
}