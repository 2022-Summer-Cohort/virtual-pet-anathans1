//package Scrapped;
//
//import virtual_pet.VirtualPet;
//import OriginalVirtualPetRaccoon.VirtualPetShelter;
//
//import java.util.Random;
//import java.util.Scanner;
//
//
//public class VirtualPetApplication {
//
//
////TODO create a greeting like below to open the game
//// System.out.println("This is Rocky, you're new raccoon. You took him in off the street and decided to take care of him.")
//// System.out.println("Your job is to keep him fed, hydrated and occupied. If you don't... he may turn on you!")
//
//    public static void main(String[] args) {
//        //Interact with a VirtualPet object in this method
//        VirtualPetShelter shelter = new VirtualPetShelter();
//    //    System.out.println("This is Rocky, you're new raccoon. You took him in off the street and decided to take care of him.");
//    //    System.out.println("Your job is to keep him fed, hydrated and occupied. If you don't... he may turn on you!");
//       // VirtualPet rocky = new VirtualPet("getName", 5, 5, 5, 5);
//        // calling line 26 from the class VirtualPet...
//        String userOption = "";
//        Scanner input = new Scanner(System.in);
//        System.out.println("Would you like to create a new pet?");
//        String answer = input.nextLine();
//        VirtualPet newPet = null;
//
//
//        if (answer.equalsIgnoreCase("yes")) {
//            newPet = CreatePet();
//            shelter.admitToVirtualPetShelter(newPet);
//        }
//        else {
//            // TODO put everything in a while loop
//            while (!userOption.equalsIgnoreCase("quit")) {
//
//                System.out.println("hey1");
//
//              //  rocky.greeting();
//
//                System.out.println("Type feed/water/play");
//                userOption = input.nextLine();
//                switch (userOption.toLowerCase()) {
////                    case "feed":
////                        rocky.feed();
////                        break;
////
////                    case "water":
////                        rocky.water();
////                        break;
////
////                    case "play":
////                        rocky.play();
////                        break;
//
//                    case "feed all":
//                        shelter.feedAllPets();
//                        break;
//                    case "water all":
//                        shelter.waterAllPets();
//                        break;
//                    case "play all":
//                        shelter.playWithAllPets();
//                        break;
//
////               //TODO add a for loop to go from one pet to another
////                giving actions
//                }
//                System.out.println("hey2");
//             //   rocky.tick();
//
//            }
//            System.out.println("hey3");
//
//        }
//        System.out.println("hey4");
//
//
//
//        //rocky.tick();
//        newPet.tick();
//        shelter.tickShelter();
//        System.out.println("hey5");
//
//    }
//
//
//
//
//
//
//
//
//public static VirtualPet CreatePet() {
//    Scanner Input = new Scanner(System.in);
//    System.out.println("Please Name your new pet");
//    String name = Input.nextLine();
//    Random random = new Random();
//    int max = 6;
//    int min = 1;
//    int hunger = random.nextInt(max - min) + min;
//    int thirst = random.nextInt(max - min) + min;
//    int boredom = random.nextInt(max - min) + min;
//    VirtualPet newPet = new VirtualPet(name,hunger,thirst,boredom);
//    return newPet;
//        }
//}
//
//
