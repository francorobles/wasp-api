package com.tribukaldero.repository.pictures;

import com.tribukaldero.model.pictures.Picture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PicturesRepository extends JpaRepository<Picture, Integer> {

}
