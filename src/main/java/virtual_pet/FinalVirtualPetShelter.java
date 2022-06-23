package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;

public class FinalVirtualPetShelter {

    private ArrayList<Pet> shelter;

    public ArrayList<Pet> getShelter() {
        return shelter;
    }

    public FinalVirtualPetShelter() {
        shelter = new ArrayList<>();
        shelter.add(new OrganicDog("Ruckus", 2, 2, 2, 2, 2));
        shelter.add(new OrganicCat("Simba", 2, 2, 2, 2, 2));
        shelter.add(new RoboticDog("Zoid", 2, 2));
        shelter.add(new RoboticCat("Clank", 2, 2));
    }

    public void feedAllPets() {
        for (Pet pet : shelter) {
            if (pet instanceof OrganicVirtualPet) {
                ((OrganicVirtualPet) pet).feed();
            }
        }
    }

    public void waterAllPets() {
        for (Pet pet : shelter) {
            if (pet instanceof OrganicVirtualPet) {
                ((OrganicVirtualPet) pet).water();
            }
        }
    }

    public void playAllPets() {
        for (Pet pet : shelter) {
            if (pet instanceof OrganicVirtualPet) {
                ((OrganicVirtualPet) pet).play();
            }
        }
    }

    public void walkAllPets() {
        for (Pet pet : shelter) {
            if (pet instanceof OrganicVirtualPet) {
                ((OrganicVirtualPet) pet).walk();
            }
        }
    }

    public void cleanAllCages() {
        for (Pet pet : shelter) {
            if (pet instanceof OrganicDog) {
                ((OrganicDog) pet).cleanCage();
            }
        }
    }

    public void cleanLitterBox() {
        for (Pet pet : shelter) {
            if (pet instanceof OrganicCat) {
                ((OrganicCat) pet).cleanLitterBox();
            }
        }
    }

    public void changeAllOil() {
        for (Pet pet : shelter) {
            if (pet instanceof RoboticVirtualPet) {
                ((RoboticVirtualPet) pet).changeOil();
            }
        }
    }

    public void mainenanceAll() {
        for (Pet pet : shelter) {
            if (pet instanceof RoboticVirtualPet) {
                ((RoboticVirtualPet) pet).fix();
            }
        }
    }

    public void tickShelter() {
        for (Pet pet : shelter) {
            if (pet instanceof TickInterface)
                ((TickInterface) pet).tick();
        }
    }

    public Pet findPetByName(String name) {
        for (Pet temporaryPet : shelter) {
            if (temporaryPet.getName().equalsIgnoreCase(name)) {
                return temporaryPet;
            }
        }
        return null;
    }

    public void admitOrganicDog(String name) {
        shelter.add(new OrganicDog(name, 2, 2, 2, 2, 2));
    }

    public void admitOrganicCat(String name) {
        shelter.add(new OrganicCat(name, 2, 2, 2, 2, 2));
    }

    public void admitRoboticDog(String name) {
        shelter.add(new RoboticDog(name, 2, 2));
    }

    public void admitRoboticCat(String name) {
        shelter.add(new RoboticCat(name, 2, 2));
    }

    public void adoptFromVirtualPetShelter(String name) {
        shelter.remove(findPetByName(name));
    }

    public int shelterPopulation() {
        return (shelter.size());
    }

    public void showAllPetStats() {
        for (Pet pet : shelter) {
            pet.greeting();
        }
    }


//   TODO ??????? public void showAllOrganicPetStats(){
//        for(OrganicDog dog: shelter){
//            dog.greeting();
//        }
//    }

    public static void interactMenu() {
        System.out.println("Type 1 to feed a specific Organic Pet.");
        System.out.println("Type 2 to give water to a specific pet.");
        System.out.println("Type 3 to play with a specific pet.");
        System.out.println("Type 4 to change the oil on a specific robotic pet.");
        System.out.println("Type 5 to do maintenance to a specific pet");
    }
}