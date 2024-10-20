package com.devsuperior.dsmovie.controllers;

import com.devsuperior.dsmovie.model.dto.MovieDTO;
import com.devsuperior.dsmovie.model.dto.ScoreDTO;
import com.devsuperior.dsmovie.model.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/scores")
public class ScoreController {

    @Autowired
    private ScoreService service;

    @PutMapping()
    public MovieDTO saveScore(@RequestBody ScoreDTO dto) {
        return service.saveScore(dto);
    }
}
