package com.Games.dslistt.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Games.dslistt.dto.GameMinDTO;
import com.Games.dslistt.entities.Game;
import com.Games.dslistt.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		
		List<Game> result = gameRepository.findAll();
		return result.stream().map( x -> new GameMinDTO(x)).toList();
	}
}
