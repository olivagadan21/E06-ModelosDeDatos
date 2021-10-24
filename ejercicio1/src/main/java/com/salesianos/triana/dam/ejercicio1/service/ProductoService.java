package com.salesianos.triana.dam.ejercicio1.service;

import com.salesianos.triana.dam.ejercicio1.model.Producto;
import com.salesianos.triana.dam.ejercicio1.repos.ProductoRepository;
import com.salesianos.triana.dam.ejercicio1.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ProductoService extends BaseService<Producto, Long, ProductoRepository> {
}
