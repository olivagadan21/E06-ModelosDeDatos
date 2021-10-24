package com.salesianos.triana.dam.ejercicio1.repos;

import com.salesianos.triana.dam.ejercicio1.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
