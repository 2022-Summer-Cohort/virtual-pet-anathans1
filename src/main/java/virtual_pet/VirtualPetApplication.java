package virtual_pet;

import java.util.Scanner;


public class VirtualPetApplication {

//TODO create a greeting like below to open the game
// System.out.println("This is Rocky, you're new raccoon. You took him in off the street and decided to take care of him.")
// System.out.println("Your job is to keep him fed, hydrated and occupied. If you don't... he may turn on you!")

    public static void main(String[] args) {
        //Interact with a VirtualPet object in this method
        System.out.println("This is Rocky, you're new raccoon. You took him in off the street and decided to take care of him.");
        System.out.println("Your job is to keep him fed, hydrated and occupied. If you don't... he may turn on you!");
        VirtualPet rocky = new VirtualPet("Rocky", 5, 5,5,5);
        // calling line 26 from the class VirtualPet...
        String userOption = "";
        Scanner input = new Scanner(System.in);
        while (!userOption.equalsIgnoreCase("quit")) {

                rocky.greeting();
                System.out.println("Type feed/water/play");
                userOption = input.nextLine();
            switch (userOption.toLowerCase()) {
                case "feed":
                    rocky.feed();
                    break;

                case "water":
                    rocky.water();
                    break;

                case "play":
                    rocky.play();
                    break;
                }


                rocky.tick();

            }
        }
    }



