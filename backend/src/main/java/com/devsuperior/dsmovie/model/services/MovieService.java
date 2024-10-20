package com.devsuperior.dsmovie.model.services;

import com.devsuperior.dsmovie.model.dto.MovieDTO;
import com.devsuperior.dsmovie.model.entities.Movie;
import com.devsuperior.dsmovie.model.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;

    @Transactional(readOnly = true)
    public Page<MovieDTO> findAll(Pageable pageable){
        Page<Movie> result = repository.findAll(pageable);
        Page<MovieDTO> pageDTO = result.map(MovieDTO::new); // (x -> new MovieDTO(x));
        return pageDTO;
    }

    public MovieDTO findById(Long id){
        Movie result = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Invalid Movie ID"));
        MovieDTO dto = new MovieDTO(result);
        return dto;
    }
}
