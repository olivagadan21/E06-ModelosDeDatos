package com.salesianos.triana.dam.ejercicio2.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Builder
public class Video implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private int orden;
    private String titulo;

    @Lob
    private String descripcion;

    private String url;

    @ManyToOne
    private CursoOnline cursoOnline;

}
