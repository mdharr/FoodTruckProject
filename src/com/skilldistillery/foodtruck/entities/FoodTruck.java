package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	
	private static int nextTruckId = 1;
	private String name;
	private String type;
	private int id;
	private int rating;
		
	public FoodTruck() {
		this.id = nextTruckId;
		nextTruckId++;

	}
	
	public FoodTruck(String name, String type, int rating) {
		this.id = nextTruckId;
		nextTruckId++;
		this.name = name;
		this.type = type;
		this.rating = rating;
	}

	public static int getNextTruckId() {
		return nextTruckId;
	}

	public static void setNextTruckId(int nextTruckId) {
		FoodTruck.nextTruckId = nextTruckId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	@Override
	public String toString() {
//		return "FoodTruck [name=" + name + ", type=" + type + ", id=" + id + ", rating=" + rating + "]";
		StringBuilder output = new StringBuilder(5);
		output.append("name= ").append(name).append(", type= ").append(type).append(", id= ").append(id).append(", rating= ").append(rating);
		return output.toString();
	}
	
	public void displayFoodTruck() {
		String foodTruckData = toString();
		System.out.println(foodTruckData);
	}
}
