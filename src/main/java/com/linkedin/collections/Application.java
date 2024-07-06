package com.linkedin.collections;

import java.util.HashSet;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		
		Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
		Room oxford = new Room("Oxford", "Suite", 5, 225.0);
		Room oxfordDuplicate = new Room("Oxford", "Suite", 5, 225.0);
		Room victoria = new Room("Victoria", "Suite", 5, 225.00);

		Set<Room> rooms = new HashSet<>();

		rooms.add(oxford);
		rooms.add(piccadilly);
		rooms.add(oxfordDuplicate);
		rooms.add(victoria);

		Set<Room> more = Set.of(piccadilly,oxford);
		//more.add(victoria);

		Set<Room> morerooms = Set.copyOf(rooms);
		//morerooms.add(victoria);

		morerooms.stream()
			.map(r -> r.getName())
			.forEach(System.out::println);

		
	}
}
