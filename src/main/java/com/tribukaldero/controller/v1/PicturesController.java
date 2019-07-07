package com.tribukaldero.controller.v1;

import com.tribukaldero.model.pictures.Picture;
import com.tribukaldero.service.PicturesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/v1/picture")
public class PicturesController {

    @Autowired
    private PicturesService picturesService;

    @GetMapping(value = "/pictures")
    public @ResponseBody List<Picture> pictures() {
        return picturesService.listAll();
    }

}
