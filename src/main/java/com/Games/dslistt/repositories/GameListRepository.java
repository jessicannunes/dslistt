package com.Games.dslistt.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.Games.dslistt.entities.GameList;


public interface GameListRepository extends JpaRepository<GameList, Long>{

}
