package com.salesianos.triana.dam.ejercicio1.service;

import com.salesianos.triana.dam.ejercicio1.model.Categoria;
import com.salesianos.triana.dam.ejercicio1.repos.CategoriaRepository;
import com.salesianos.triana.dam.ejercicio1.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService extends BaseService<Categoria, Long, CategoriaRepository> {
}
