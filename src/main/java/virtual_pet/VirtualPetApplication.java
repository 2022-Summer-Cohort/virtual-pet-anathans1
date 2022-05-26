package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        //Interact with a VirtualPet object in this method
        VirtualPet rocky = new VirtualPet("Rocky", 3, 5,5,5);
        String userOption = "";
        Scanner input = new Scanner(System.in);
        while (true) {

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
        // while(true){
        //    rocky.greeting();

    }



