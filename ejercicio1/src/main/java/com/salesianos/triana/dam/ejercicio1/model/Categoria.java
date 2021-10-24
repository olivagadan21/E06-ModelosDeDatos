package com.salesianos.triana.dam.ejercicio1.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Categoria {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    @ManyToOne
    @JoinColumn(name = "categoria", foreignKey = @ForeignKey(name = "FK_CATEGORIA_CATEGORIA"))
    private Categoria categoria;

    public Categoria(String nombre) {
        this.nombre = nombre;
    }

}
