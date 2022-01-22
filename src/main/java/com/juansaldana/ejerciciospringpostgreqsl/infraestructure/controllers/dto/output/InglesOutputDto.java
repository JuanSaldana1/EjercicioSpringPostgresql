package com.juansaldana.ejerciciospringpostgreqsl.infraestructure.controllers.dto.output;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
public class InglesOutputDto {
    @Id
    private int id;

    private String palabra;
    private String definicion;
    private Date fechaAlta;
    private Date fechaModificacion;
    private String palabraEspanol;
}