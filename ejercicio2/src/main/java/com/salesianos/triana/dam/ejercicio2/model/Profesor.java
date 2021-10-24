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
public class Profesor implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre, email;
    private double puntuacion;

    @OneToMany(fetch = FetchType.EAGER)
    private List<CursoOnline> cursosOnline = new ArrayList<>();

    public void addCurso(CursoOnline c) {
        this.cursosOnline.add(c);
        c.setProfesor(this);
    }

    public void removeProfesor(Profesor p) {
        this.cursosOnline.remove(p);
        p.setCursosOnline(null);
    }

}
