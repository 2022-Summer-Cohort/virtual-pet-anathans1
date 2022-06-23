package virtual_pet;

public class OrganicDog extends OrganicVirtualPet {

    private int cage;

    public OrganicDog(String name, int hungerLevel, int thirstLevel, int boredomLevel, int needToGoPotty, int cage) {
        super(name, hungerLevel, thirstLevel, boredomLevel, needToGoPotty);
        this.cage = cage;
    }


    public int getCage() {
        return cage;
    }

    @Override
    public void greeting() {
//    System.out.println(getName() + " the organic dog's hunger level is " + getHungerLevel() + ", its thirst level is ");
//    System.out.println(getThirstLevel() +", its boredom level is " + getBoredomLevel() + ", and its need to go potty is " + getNeedToGoPotty() + ".");
//    System.out.println("            " + getName() + "'s and its cage is at a " + getCage() + " level of filth.");
        System.out.println(getName() + ":");
        System.out.println("Hunger Level: " + getHungerLevel());
        System.out.println("Thirst Level: " + getThirstLevel());
        System.out.println("Boredom Level: " + getBoredomLevel());
        System.out.println("Need to go potty: " + getNeedToGoPotty());
        System.out.println("Cage filth level: " + getCage());
        System.out.println(" ");
    }

    public void soilCage() {
        if (getNeedToGoPotty() > 9) {
            cage++;
            if (cage > 0) {
                System.out.println(getName() + "'s cage has been soiled! You need to clean it!");
            }
            if (cage > 5) {
                System.out.println(getName() + "'s cage has become so filthy that PITA has shut down the shelter.");
                System.exit(0);
            }
        }
    }

    public void cleanCage() {
        cage = 0;
        System.out.println(getName() + "'s cage has been cleaned.");
    }


}






