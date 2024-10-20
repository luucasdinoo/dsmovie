package com.devsuperior.dsmovie.model.repositories;

import com.devsuperior.dsmovie.model.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {}
