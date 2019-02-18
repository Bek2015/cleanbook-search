package com.bookhotel.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.bookhotel.entity.Room;

@Component
public class RoomDAO {

	public static List<Room> findAll(){
		List<Room> list = new ArrayList<Room>();
		list.add(new Room(1, "1001","Breeze", "Single Bed", 1, false, true));
		list.add(new Room(2, "1002","Fountain", "Double Bed", 1, false, true));
		list.add(new Room(3, "2001","Windy", "Single Bed", 2, false, true));
		list.add(new Room(4, "2002","South Bend", "Single Bed", 2, false, true));
		return list;
	}
}
