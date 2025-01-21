package com.Games.dslistt.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.Games.dslistt.entities.Game;


public interface GameRepository extends JpaRepository<Game, Long>{

}
