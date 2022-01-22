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
public class InglesSimpleOutputDto {
    @Id
    private int id;

    private String palabra;
    private Date fechaAlta;
    private Date fechaModificacion;
}