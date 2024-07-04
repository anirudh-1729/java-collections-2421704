package com.linkedin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class RoomService {

	// 1. Declare a Collection to store Room Inventory

	Collection<Room> Inventory;

	public RoomService() {
		
	// 2. Initialize Collection and assign it to the Room Inventory
	this.Inventory = new HashSet<>();
	}

	public Collection<Room> getInventory(){
		
	// 3. Return the Room Inventory
		
		return new HashSet<>(this.Inventory);
	}
	
	public void createRoom(String name, String type, int capacity, double rate) {
	
	// 4. Add a new Room to the Room Inventory using the provided parameters
	this.Inventory.add(new Room(name, type, capacity, rate));


	}

	public void createRooms(Room[] rooms) {
	
	// 5. Add the Rooms provided in the Array to the Room Inventory
	this.Inventory.addAll(Arrays.asList(rooms));

	}
	
	public void removeRoom(Room room) {
		
	// 6. Remove the provided Room from the Room Inventory
	this.Inventory.remove(room);

	}

}
