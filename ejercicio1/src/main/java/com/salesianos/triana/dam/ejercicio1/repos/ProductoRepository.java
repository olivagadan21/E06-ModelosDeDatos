package com.salesianos.triana.dam.ejercicio1.repos;

import com.salesianos.triana.dam.ejercicio1.model.Categoria;
import com.salesianos.triana.dam.ejercicio1.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    List<Producto> findByCategoria(Categoria categoria);
}
