package virtual_pet;

import virtual_pet.OrganicVirtualPet;

public class OrganicCat extends OrganicVirtualPet {

    private int litterBox;

    public OrganicCat(String name, int hungerLevel, int thirstLevel, int boredomLevel, int needToGoPotty, int litterBox) {
        super(name, hungerLevel, thirstLevel, boredomLevel, needToGoPotty);
        this.litterBox = litterBox;
    }

    public int getLitterbox() {
        return litterBox;
    }

    public void greeting() {
//        System.out.println(getName() + " the organic cat's hunger level is " + getHungerLevel() + ", its thirst level is ");
//        System.out.println(getThirstLevel() +", its boredom level is " + getBoredomLevel() + ", and its need to go potty is " + getNeedToGoPotty() + ".");
//        System.out.println("            " + getName() + "'s and its litter box is at a " + getLitterbox() + " level of filth.");
        System.out.println(getName() + ":");
        System.out.println("Hunger Level: " + getHungerLevel());
        System.out.println("Thirst Level: " + getThirstLevel());
        System.out.println("Boredom Level: " + getBoredomLevel());
        System.out.println("Need to go potty: " + getNeedToGoPotty());
        System.out.println("Litter box filth level: " + getLitterbox());
        System.out.println(" ");
    }

    public void soilLitterBox() {

        if (getNeedToGoPotty() > 5) {
            litterBox++;
        }
        if (litterBox > 5) {
            System.out.println("You need to clean " + getName() + "'s litter box!");
        }
        if (litterBox > 8) {
            System.out.println(getName() + "'s litter box has become so filthy that feces have been tracked all over the house");
            System.out.println("PITA has shut down the shelter");
            System.exit(0);
        }
    }

    public void cleanLitterBox() {
        litterBox = 0;
        System.out.println(getName() + "'s litter box has been cleaned.");
    }
    //TODO create a tick function and kill the pets through it
}
