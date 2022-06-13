package virtual_pet;

public class RoboticDog extends RoboticVirtualPet {

    public RoboticDog(String name, int needForOilChange, int needForMaintenance) {
        super(name, needForOilChange, needForMaintenance);
    }

    public void greeting() {
//        System.out.println(getName() + " the robotic dog's need for an oil change is at a " + getNeedForOilChange() + "/10,");
//        System.out.println("and it's need for maintenance is at a " + getNeedForMaintenance() + "/10.");
        System.out.println(getName() + ":");
        System.out.println("Need for Oil Change: " + getNeedForOilChange());
        System.out.println("Need for maintenance: " + getNeedForMaintenance());
        System.out.println(" ");
    }
}
