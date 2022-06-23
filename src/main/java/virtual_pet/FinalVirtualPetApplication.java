package virtual_pet;

import java.util.Scanner;

public class FinalVirtualPetApplication {

    public static void main(String[] args) {

        System.out.println("Welcome to your local Pet Shelter!");

        String userInput = "";
        FinalVirtualPetShelter shelter = new FinalVirtualPetShelter();
        String keyPress;
        while (!userInput.equalsIgnoreCase("quit")) {
            //    shelter.showAllPetStats();
            System.out.println("What would you like to do?");
            System.out.println("Type 0 for a list of options.");
            System.out.println("Type status to show all pet statuses.");
            Scanner input = new Scanner(System.in);
            keyPress = input.nextLine();
//            input.reset();
            switch (keyPress) {
                case "status":
                    shelter.showAllPetStats();
                    break;
                case "0":
                    mainMenu();
                    break;
                case "1":
                    shelter.feedAllPets();
                    System.out.println("All organic pets have been fed.");
                    break;
                case "2":
                    shelter.waterAllPets();
                    System.out.println("All organic pets have been adequately hydrated.");
                    break;
                case "3":
                    shelter.playAllPets();
                    System.out.println("You spent an hour outside with pets who weren't sleeping.");
                    System.out.println("All that pent up energy in the organic pets has been expended.");
                    break;
                case "4":
                    shelter.walkAllPets();
                    System.out.println("You walked all the pets at once... with difficulty.");
                    break;
                //shelter.walk
                case "5":
                    shelter.cleanAllCages();
                    System.out.println("All organic dog cages have been cleaned.");
                    break;
                case "6":
                    shelter.cleanLitterBox();
                    System.out.println("All organic cat litter boxes have been changed and cleaned");
                    break;
                case "7":
                    //        while (!userOption.equalsIgnoreCase("quit")) {
                    System.out.println("Type 1 to feed a specific Organic Pet.");
                    System.out.println("Type 2 to give water to a specific pet.");
                    System.out.println("Type 3 to play with a specific pet.");
                    System.out.println("Type 4 to walk a specific pet");
                    System.out.println("Type 5 to change the oil on a specific robotic pet.");
                    System.out.println("Type 6 to do maintenance to a specific pet");
                    System.out.println("Choose an option.");
                    keyPress = input.nextLine();
//                        input.nextInt();
                    switch (keyPress) {

//                            case 1:
//                                shelter.interactMenu();
//                                break;
                        case "1":
                            //       shelter.showAllPetStats();
                            System.out.println("Which pet would you like to feed?");
                            String feedName = input.nextLine();
                            shelter.findPetByName(feedName).feed();
                            System.out.println("You fed " + feedName);
                            break;
                        case "2":
                            //       shelter.showAllPetStats();
                            System.out.println("Which pet would you like to give water to?");
                            String name = input.nextLine();
                            shelter.findPetByName(name).water();
                            System.out.println("You gave water to " + name);
                            break;
                        case "3":
                            //       shelter.showAllPetStats();
                            System.out.println("Which pet would you like to play with?");
                            String playName = input.nextLine();
                            shelter.findPetByName(playName).play();
                            System.out.println("You played with " + playName);
                            break;
                        case "4":
                            //       shelter.showAllPetStats();
                            System.out.println("Which pet would you like to walk?");
                            String walkName = input.nextLine();
                            shelter.findPetByName(walkName).walk();
                            System.out.println("You walked " + walkName);
                            break;
                        case "5":
                            //       shelter.showAllPetStats();
                            System.out.println("Which pet would you like to change oil for?");
                            String oilName = input.nextLine();
                            shelter.findPetByName(oilName).changeOil();
                            // System.out.println("You changed oil on" + oilName);
                            break;
                        case "6":
                            //       shelter.showAllPetStats();
                            System.out.println("Which pet would you like to perform maintenance on?");
                            String maintenanceName = input.nextLine();
                            shelter.findPetByName(maintenanceName).fix();
                            // System.out.println("You fixed " + maintenanceName);
                            break;
                        default:
                            System.out.println("No pet by that name.");
                            //   break;
                    }
                    break;
                case "8":
                    System.out.println("Which pet would you like to allow someone to adopt?");
                    String petName = input.nextLine();
                    shelter.adoptFromVirtualPetShelter(petName);
                    System.out.println("You gave " + petName + " away to a loving family.");
                    break;
                case "9":
                    System.out.println("Choose an option from below:");
                    System.out.println("Type 1 for organic dog.");
                    System.out.println("Type 2 for organic cat.");
                    System.out.println("Type 3 for robotic dog.");
                    System.out.println("Type 4 for robotic cat");
                    userInput = input.nextLine();
                    switch ((userInput)) {
                        case "1":
                            System.out.println("Name your pet...");
                            shelter.admitOrganicDog(input.nextLine());
                            System.out.println("You admitted this organic dog into the shelter.");
                            break;
                        case "2":
                            System.out.println("Name your pet...");
                            shelter.admitOrganicCat(input.nextLine());
                            System.out.println("You admitted this organic cat into the shelter.");
                            break;
                        case "3":
                            System.out.println("Name your pet...");
                            shelter.admitRoboticDog(input.nextLine());
                            System.out.println("You admitted this robotic dog into the shelter.");
                            break;
                        case "4":
                            System.out.println("Name your pet...");
                            shelter.admitRoboticCat(input.nextLine());
                            System.out.println("You admitted this robotic cat into the shelter.");
                            break;
                    }
            }
            shelter.tickShelter();
        }
    }


    public static void mainMenu() {
        System.out.println("Type status to see each pet's stats.");
        System.out.println("Type 1 to feed all organic pets.");
        System.out.println("Type 2 to give water to all organic pets.");
        System.out.println("Type 3 to play with all organic pets.");
        System.out.println("Type 4 to walk all pets.");
        System.out.println("Type 5 to clean all organic dog cages.");
        System.out.println("Type 6 to clean all organic cat litter boxes.");
        System.out.println("Type 7 to interact with a specific pet.");
        //System.out.println("Type 6 to change the oil on all robotic pets.");
        //System.out.println("Type 10 to do maintenance to all robotic pets.");
        System.out.println("Type 8 to allow a pet to be adopted from the shelter.");
        System.out.println("Type 9 to admit a pet into the shelter.");


    }

}









//    public static void interactMenu() {
//        System.out.println("Type 1 to feed a specific Organic Pet.");
//        System.out.println("Type 2 to give water to a specific pet.");
//        System.out.println("Type 3 to play with a specific pet.");
//        System.out.println("Type 4 to walk a specific pet.");
//        System.out.println("Type 5 to change the oil on a specific robotic pet.");
//        System.out.println("Type 6 to do maintenance to a specific pet");
//    }

//    public static void admitMenu() {
//        System.out.println("Type 1 to admit an organic dog into the shelter.");
//        System.out.println("Type 2 to admit an organic cat into the shelter.");
//        System.out.println("Type 3 to admit a robotic dog into the shelter.");
//        System.out.println("Type 4 to admit a robotic car into the shelter.");
//    }


//        public void interactWithSpecificPet() {
//            int keyPress;
//            String userOption = "";
//            while (!userOption.equalsIgnoreCase("quit")) {
//                shelter.showAllPetStats();
//                System.out.println("What would you like to do?");
//                Scanner input = new Scanner(System.in);
//                keyPress = input.nextInt();
//                switch (keyPress) {
//                    case 0:
//                }
//            }
//        }
