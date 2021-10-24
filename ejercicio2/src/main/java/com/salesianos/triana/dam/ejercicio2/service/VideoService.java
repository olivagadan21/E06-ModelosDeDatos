package com.salesianos.triana.dam.ejercicio2.service;

import com.salesianos.triana.dam.ejercicio2.model.Video;
import com.salesianos.triana.dam.ejercicio2.repos.VideoRepository;
import com.salesianos.triana.dam.ejercicio2.service.base.BaseService;

public class VideoService extends BaseService <Video, Long, VideoRepository> {

    public VideoService(VideoRepository repo) {
        super(repo);
    }

}
