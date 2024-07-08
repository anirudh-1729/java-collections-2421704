package com.linkedin.collections;

import java.util.HashMap;
import java.util.Map;

public class Application {

	public static void main(String[] args) {

		Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
		Room oxford = new Room("Oxford", "Suite", 5, 225.0);


		// RoomWithBadKey piccadilly = new RoomWithBadKey("Piccadilly", "Guest Room", 3, 125.00);
		// RoomWithBadKey oxford = new RoomWithBadKey("Oxford", "Suite", 5, 225.0);

		Guest john = new Guest("John", "Doe", false);
		Guest maria = new Guest("Maria", "Doe", true);

		Map<Room,Guest> assignments = new HashMap<>();

		assignments.put(oxford, maria);
		assignments.put(piccadilly, john);

		// Swapping guests
		Guest guest = assignments.put(oxford, assignments.remove(piccadilly));
		assignments.putIfAbsent(piccadilly, guest);


		System.out.println("oxford: "+assignments.get(oxford));
		System.out.println("Piccadilly: " + assignments.get(piccadilly));
		System.out.println(guest);
		//System.out.println("Piccadilly new: " + assignments.get(new Room("Piccadilly", "Guest Room", 3 , 125.00)));
		

		
				
	}

}
