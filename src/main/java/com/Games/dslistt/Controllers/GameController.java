package com.Games.dslistt.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.Games.dslistt.dto.GameDTO;
import com.Games.dslistt.dto.GameMinDTO;
import com.Games.dslistt.services.GameService;

public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public GameDTO findById(@PathVariable Long id) {
		 GameDTO result= gameService.findbyId(id);
		 return result;
	}
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> result = gameService.findAll();
		return result;
	}
	
	
	
}
