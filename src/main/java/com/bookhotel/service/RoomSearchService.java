package com.bookhotel.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bookhotel.DAO.RoomDAO;
import com.bookhotel.entity.Room;

@Component
public class RoomSearchService {

	public List<Room> findAll(){
		return RoomDAO.findAll();
	}
}
