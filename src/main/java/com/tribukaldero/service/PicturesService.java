package com.tribukaldero.service;

import com.tribukaldero.model.pictures.Picture;
import com.tribukaldero.repository.pictures.PicturesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PicturesService {

    @Autowired
    private PicturesRepository picturesRepository;

    public List<Picture> listAll() {
        return picturesRepository.findAll();
    }
}
