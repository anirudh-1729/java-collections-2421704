package com.linkedin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Application {

	public static void main(String[] args) {
		
		Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
		Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
		Room westminister = new Room("Westminister", "Premiere Room", 4, 200.00);
		
		Collection<Room> rooms = new ArrayList<>(Arrays.asList(cambridge,piccadilly, westminister));

		Iterator<Room> iter = rooms.iterator();
		Iterator<Room> iter2 = rooms.iterator();
		
		// System.out.println(iter.next().getName());
		// System.out.println(iter.next().getName());
		// System.out.println(iter.next().getName());

		// first loop
		System.out.println("1");
		while (iter.hasNext()) {
			
			Room rooms2 = iter.next();
			System.out.println(rooms2.getName() + " " + rooms2.getRate() + " " +  rooms2.getType());
		}

		//second loop
		System.out.println("2");
		while (iter2.hasNext()) {

			System.out.println( iter2.next().getName() + " " + iter2.next().getRate() + iter2.next().getType());
			
		}

		// third loop
		System.out.println("3");
		for (Room room : rooms) {
			
			System.out.println(room.getName() + " " + room.getRate() + " " + room.getType());
		}

		
			
	}
}
