package com.salesianos.triana.dam.ejercicio1;

import com.salesianos.triana.dam.ejercicio1.model.Categoria;
import com.salesianos.triana.dam.ejercicio1.model.Producto;
import com.salesianos.triana.dam.ejercicio1.service.CategoriaService;
import com.salesianos.triana.dam.ejercicio1.service.ProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class MainDePruebas {

    private final ProductoService productoService;
    private final CategoriaService categoriaService;

    @PostConstruct
    public void test() {
        Producto producto = Producto.builder()
                .nombre("Bocadillo de choped")
                .pvp(1.20)
                .build();

        productoService.save(producto);

        productoService.findAll().forEach( a -> System.out.printf("%s %s\n", a.getNombre(), a.getPvp()));

        Categoria categoria = Categoria.builder()
                .nombre("Bocadillos")
                .build();

        categoriaService.save(categoria);

        categoriaService.findAll().forEach( a -> System.out.printf("%s\n", a.getNombre()));


    }

}
