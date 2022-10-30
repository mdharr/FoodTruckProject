package com.skilldistillery.foodtruck.app;

import java.util.Random;
import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	private static final int MAX_TRUCKS = 5;
	private FoodTruck[] totalTrucks = new FoodTruck[MAX_TRUCKS];
	private String name = "";
	private String type;
	private int rating;
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		FoodTruckApp truckApp = new FoodTruckApp();
		
		truckApp.greeting();
		
		truckApp.addTruck();
		
		truckApp.mainMenu();
		
		scanner.close();

	}

	public void greeting() {
		System.out.println("Welcome to Food Truck App!");
		String userChoice = "Press '1' to begin or '2' for another greeting!";
				while(true) {
					System.out.println(userChoice);
					int selection = scanner.nextInt();
					if(selection == 1) {
						break;
					} else if (selection == 2) {
						getGreeting();
						System.out.println();
					} else {
						System.err.println("You must've fat-fingered that one. Let's try that again.");
						System.out.println();
						continue;
					}
				}
		}
	
	public String getGreeting() {
		String[]greetings = {"This is the one and only Food Truck App!", "Food Truck App is the number one app for all of your Food Truck needs.", "Looking for Food Truck information? You've come to the right place! Welcome to Food Truck App!", "Okay, this is the last unique greeting ... or is it? Press '2' again next time to find out.", "Not happy with your food truck experience? You've come to the right place to complain. Food Truck App at your service!", "FOOOOOOOOOOOD TRUCK APP!", "You have too much time on your hands. We hope you enjoy your time with Food Truck App.", "'42' is 'Food Truck App' spelled backwards. Welcome.", "'Klaatu, Barada, Nikto' translates to 'Food Truck App' in at least one language, right?"}; 
		
		Random rand = new Random();
		String greet = greetings[rand.nextInt(greetings.length)];
		System.out.println(greet);
		return greet;
	}

	public void addTruck() {
		int truckCounter = 1;
		for (int i = 0; i < MAX_TRUCKS; i++) {
			
			System.out.println("Let's get the information for Food Truck " + truckCounter + ": ");
			System.out.println();
			System.out.println("Food Truck Name: ");

			scanner.nextLine();
			name = scanner.nextLine();
			
			if(name.equals("quit")) {
				break;
			}

			System.out.println("Food Type: ");
			type = scanner.nextLine();
			
			System.out.println("Rating 1-5: ");
			rating = scanner.nextInt();

			FoodTruck foodtruck = new FoodTruck(name, type, rating);
			totalTrucks[i] = foodtruck;
			truckCounter++;

		}
	}
	
	public void mainMenu() {

		int sum = 0;
		int i = 0;
		double average = 0.0;
		for (i = 0; i < totalTrucks.length; i++) {
			if(totalTrucks[i] != null) {
				sum += totalTrucks[i].getRating();
				break;
			}
		}
		
		average = sum / (i + 1);
		
		int highest = totalTrucks[0].getRating();
		for (int k = 0; k < totalTrucks.length; k++) {
			if(totalTrucks[k] != null) {
				if(totalTrucks[k].getRating() > highest) {
					highest = totalTrucks[k].getRating();
					
				}
			}
		}
		
		
		while (true) {
			System.out.println("Please input a number to select one of the following options: ");
			System.out.println("--------------------------------------------------------------------");
			System.out.println("| 1) Food Trucks | 2) Average Rating | 3) Highest Rating | 4) Quit |");
			System.out.println("--------------------------------------------------------------------");
			
			int userInput = scanner.nextInt();
			
			if (userInput == 1) {
				for(int j = 0; j < totalTrucks.length; j++) {
					if(totalTrucks[j] != null) {
						totalTrucks[j].displayFoodTruck();
					}
				}
				System.out.println();
			} else if (userInput == 2) {
				System.out.println("The average rating is: " + average);
			} else if (userInput == 3) {
				System.out.println("The highest rated food truck is: ");
				for(int r = 0; r < totalTrucks.length; r++) {
					if(totalTrucks[r] != null && totalTrucks[r].getRating() == highest) {
						totalTrucks[r].displayFoodTruck();
					}
				}
			} else if (userInput == 4) {
				System.out.println("Program closing...");
				System.out.println("Have a wonderful day!");
				System.out.println("Goodbye.");
				break;
			} else {
				
				continue;
			}
		}

	}

}
