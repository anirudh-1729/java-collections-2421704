package com.linkedin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class Application {

	public static void main(String[] args) {

		Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
		Room manchester = new Room("Manchester", "Suite", 5, 250.00);
		Room oxford = new Room("Oxford", "Suite", 5, 225.0);
		Room victoria = new Room("Victoria", "Suite", 5, 225.00);

		Collection<Room> rooms = new ArrayList<>(Arrays.asList(cambridge, oxford, victoria, manchester));
		oxford.setPetFriendly(true);
		victoria.setPetFriendly(true);
		
		Collection<Room> petFriendlyRooms = rooms.stream()
			.filter(Room::isPetFriendly)
			.collect(Collectors.toList());
		
		petFriendlyRooms.stream()
			.map( r -> r.getName())
			.forEach(System.out::println);

		double sum = petFriendlyRooms.stream()
		.mapToDouble(r -> r.getRate())
		.sum();	

		System.out.println(sum);
		
	}
}
