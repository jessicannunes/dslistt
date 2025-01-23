package com.Games.dslistt.dto;

import com.Games.dslistt.entities.GameList;

public class GameListDTO {
	
	public Long Id;
	public String Name;
	
	public GameListDTO(){
		
	}

	public GameListDTO(GameList entity) {
		
		Id = entity.getId();
		Name = entity.getName();
	}

	public Long getId() {
		return Id;
	}

	public String getName() {
		return Name;
	}
	
	

}
