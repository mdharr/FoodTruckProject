# Food Truck Project

## Description

This program does the following:

After displaying a greeting, the user is prompted to choose either continue to getting another random greeting from an array of greetings. 

Upon inputing '1' to continue, the user is then asked to provide a few details for the food truck(s). The max number of food trucks a single user can input is 5 until the program ends. The data fields required are: name of food truck, type of food, and the rating provided by user. Each time a new food truck is instantiated, a unique numeric number is generated and assigned to it.

In the final section, all null values in the array of food trucks are ignored, and the program uses all of the data for each food truck to calculated each of their toStrings, the average rating, and determine which food truck is the highest rated. The user is presented with a menu that, depending on user input (1-4), either displays all food truck data (name, type, id, rating), the average rating, or which truck(s) have the highest rating. This data is accessible until the user enters '4', at which point the program ends and displays a farewell message.

## Technologies Used

Java, GitHub, Git, Eclipse, Atom

## Lessons Learned

Documenting progress:# FoodTruckProject

This week's project was the first project that incorporated objects, private data, and non-static methods. It really pushed me to my current limits and required lots of research, advice, and iteration in order to find solutions for a few bugs in the final method 'mainMenu'. The two largest challenges I faced in this week's project were: 

- 1. Finding a way to take user input, construct a new food truck object, and assign the user input data to that specific object, after which the object would be placed in an array, and the loop would begin again, up to a maximum of 5 food trucks. 

- 2. When calculating the 'average rating' and 'highest rated' categories, I encountered a 'nullPointerException' error. Through the debugging process, I later determined that this was caused by the food truck array returning null values when a user enters less than 5 food trucks. So figuring out a way to stop my array from returning null values proved to be quite the challenge given my knowledge at the time.  The solution ended up being the simple addition of an if statement within the for loop used to calculate average/highest rating that only allow for values which were not null values. i.e. if(totalTrucks[k] != null). This project was at times frustrating, at times hopeless, but it was ultimately very rewarding to overcome these challenges. I learned a lot and was able to cement many of the concepts that were previously still a bit unclear to me.

