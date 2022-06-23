package virtual_pet;

import virtual_pet.Pet;

public abstract class RoboticVirtualPet extends Pet implements TickInterface, FeedInterface, WaterInterface, PlayInterface, WalkInterface {

    private int needForOilChange;
    private int needForMaintenance;

    public RoboticVirtualPet(String name, int needForOilChange, int needForMaintenance) {
        super(name);
        this.needForOilChange = needForOilChange;
        this.needForMaintenance = needForMaintenance;
    }

    public int getNeedForOilChange() {
        return needForOilChange;
    }

    public int getNeedForMaintenance() {
        return needForMaintenance;
    }

    @Override
    public void feed() {
        System.out.println("Robotic pets don't eat food. You're robotic pet stares lifelessly at you're strange gift.");
    }

    @Override
    public void water() {
        System.out.println("Water harms robots." + getName() + " took some damage.");
        needForMaintenance++;
    }

    @Override
    public void play() {
        System.out.println(getName() + " is a robot. Robots don't play.");
    }

    @Override
    public void walk() {
        System.out.println("The robot pet walks with you obediently");
        needForMaintenance++;
        needForOilChange++;
    }

    public void changeOil() {
        needForOilChange = 0;
        System.out.println(getName() + "'s oil has been changed.");
    }

    public void fix() {
        needForMaintenance = 0;
        System.out.println("You ran " + getName() + "'s diagnostics and made necessary repairs.");
    }

    public void tick() {
        needForOilChange++;
        needForMaintenance++;
        if (needForOilChange == 8 || needForOilChange == 9 || needForOilChange == 10 || needForOilChange == 11) {
            System.out.println(getName() + " needs an oil change!");
        }
        if (needForOilChange > 11) {
            System.out.println(getName() + "'s oil has become so dirty that its motor has locked up.");
            System.out.println("PETRA has shut down the shelter.");
            System.exit(0);
        }
        if (needForMaintenance == 8 || needForMaintenance == 9 || needForMaintenance == 10 || needForMaintenance == 11) {
            System.out.println(getName() + " is in need of maintenance!");
        }
        if (needForMaintenance > 11) {
            System.out.println(getName() + "'s components have worn down to the point of failure.");
            System.out.println("PETRA has shut down the shelter.");
            System.exit(0);
        }
    }


    //TODO create a tick function and kill the pets through it
}

