package com.bookhotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookhotel.entity.Room;
import com.bookhotel.service.RoomSearchService;

@RestController
public class RoomSearchController {
	
	@Autowired
	private RoomSearchService roomService;

	@GetMapping(path = "/rooms")
	public List<Room> findAll(){
		
		return roomService.findAll();
	}
}
