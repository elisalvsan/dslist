package com.andrade.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrade.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}