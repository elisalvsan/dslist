package com.andrade.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrade.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}