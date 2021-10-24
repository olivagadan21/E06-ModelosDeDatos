package com.salesianos.triana.dam.ejercicio2.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Builder
public class CursoOnline implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private double puntuacion;

    @ManyToOne
    private Profesor profesor;

    @OneToMany
    private List<Video> videos = new ArrayList<>();

    public CursoOnline(String nombre, double puntuacion) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }

    public CursoOnline(String nombre, double puntuacion, Profesor profesor) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.profesor = profesor;
    }

}
