import virtual_pet.VirtualPet;
import virtual_pet.VirtualPetShelter;

import java.util.Random;
import java.util.Scanner;

public class TWOVirtualPetApplication {

    public static void main(String[] args) {

        System.out.println("Welcome to your local Pet Shelter!");
        System.out.println("What would you like to do?");
        System.out.println("Type 0 for a list of options.");

        String userOption = "";
        VirtualPetShelter shelter = new VirtualPetShelter();
        //earlier had the above two lines below and it kept making a new shelter. Keep instantiated variables out of the loop
        int keyPress;
        while (!userOption.equalsIgnoreCase("quit")) {
            shelter.showAllPetStats();
            System.out.println("What would you like to do?");
            Scanner input = new Scanner(System.in);
            keyPress = input.nextInt();
            input.nextLine();
            switch (keyPress) {

                case 0:
                    userInteraction();
                    break;

                case 1:
                    shelter.feedAllPets();
                    break;
                case 2:
                    shelter.waterAllPets();
                    break;
                case 3:
                    shelter.playWithAllPets();
                    break;
                case 4: {
                    shelter.showAllPetStats();
                    System.out.println("Which pet would you like to feed?");
                    String name = input.nextLine();
                    shelter.findPetByName(name).feed();
                    break;
                }
                case 5: {
                    System.out.println("Which pet would you like to give water to?");
                    String name = input.nextLine();
                    shelter.findPetByName(name).water();
                    break;
                }
                case 6:
                    shelter.showAllPetStats();
                    System.out.println("Which pet would you like to play with?");
                    String name = input.nextLine();
                    shelter.findPetByName(name).play();
                    break;
                case 7:
                    VirtualPet newPet = createPet();
                    // had to declare a variable... newPet is a declared variable of newPet
                    shelter.admitToVirtualPetShelter(newPet);
                    System.out.println("You have " + shelter.shelterPopulation() + " pets in your shelter.");
                    break;
                case 8:
                    System.out.println("Which pet would you like to allow someone to adopt?");
                    String petName = input.nextLine();
                    shelter.adoptFromVirtualPetShelter(petName);
            }
            shelter.tickShelter();
        }
    }
    public static void userInteraction() {
        System.out.println("Type 1 to feed all pets in the shelter.");
        System.out.println("Type 2 to give water to all pets in the shelter.");
        System.out.println("Type 3 to play with all pets in the shelter.");
        System.out.println("Type 4 to feed a specific pet in the shelter.");
        System.out.println("Type 5 to give water to a specific pet in the shelter.");
        System.out.println("Type 6 to play with a specific pet in the shelter.");
        System.out.println("Type 7 to admit a pet into the shelter.");
        System.out.println("Type 8 to adopt a pet from the shelter");
    }
    public static VirtualPet createPet() {
        Scanner Input = new Scanner(System.in);
        System.out.println("Please Name your new pet");
        String name = Input.nextLine();
        Random random = new Random();
        int max = 6;
        int min = 1;
        int hunger = random.nextInt(max - min) + min;
        int urgetosteal = random.nextInt(max - min) + min;
        int thirst = random.nextInt(max - min) + min;
        int boredom = random.nextInt(max - min) + min;
        VirtualPet newPet = new VirtualPet(name, hunger, urgetosteal, thirst, boredom);
        return newPet;
    }
}

