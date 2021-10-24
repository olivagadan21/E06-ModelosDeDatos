package com.salesianos.triana.dam.ejercicio2.repos;

import com.salesianos.triana.dam.ejercicio2.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {
}
