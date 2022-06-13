package virtual_pet;

import virtual_pet.Pet;

public abstract class OrganicVirtualPet extends Pet implements TickInterface, FeedInterface, WaterInterface, PlayInterface, WalkInterface, ChangeOilInterface, FixInterface {

    private int hungerLevel;
    private int thirstLevel;
    private int boredomLevel;
    private int needToGoPotty;
    private boolean soiled;

    public OrganicVirtualPet(String name, int hungerLevel, int thirstLevel, int boredomLevel, int needToGoPotty) {
        super(name);
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = boredomLevel;
        this.needToGoPotty = needToGoPotty;
        this.soiled = soiled;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public int getBoredomLevel() {
        return boredomLevel;
    }

    public int getNeedToGoPotty() {
        return needToGoPotty;
    }

    public boolean isSoiled() {
        return soiled;
    }

    public void feed() {
        hungerLevel = -1;
    }

    public void water() {
        thirstLevel = -1;
    }

    public void play() {
        if (boredomLevel > 2) {
            boredomLevel = getHungerLevel() - 3;
        } else {
            System.out.println(getName() + "doesn't want to play right now.");
        }
    }
    public void walk() {
        boredomLevel = 0;
        needToGoPotty = 0;
    }
    @Override
    public void changeOil() {
        System.out.println("No oil on this pet.");
    }
    @Override
    public void fix() {
        System.out.println("No gears on this pet.");
    }
    public void tick() {
        hungerLevel++;
        thirstLevel++;
        boredomLevel++;
        if (getHungerLevel() > 10) {
            System.out.println(getName() + "has died of hunger.");
            System.out.println("The shelter has been shut down due to animal cruelty. See you in court!");
            System.exit(0);
        }
        if (getThirstLevel() > 10) {
            System.out.println(getName() + "has died of thirst.");
            System.out.println("The shelter has been shut down due to animal cruelty. See you in court!");
            System.exit(0);
        }
        if (getBoredomLevel() > 10) {
            System.out.println(getName() + "has become so bored that" + getName() + "has torn the shelter apart.");
            System.out.println("The shelter has been shut down due to animal cruelty. See you in court!");
            System.exit(0);
        }
    }
}
//TODO create a tick function and kill the pets through it




