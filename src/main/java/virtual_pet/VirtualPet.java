package virtual_pet;

import java.time.Clock;
import java.time.Duration;

public class VirtualPet {

    private String name;

    private int hungerLevel;

    private int urgeToSteal;

    private int thirstLevel;

    private int boredomLevel;

    public VirtualPet(String name, int hungerLevel, int urgeToSteal, int thirstLevel, int boredomLevel) {
        this.name = name;
        this.hungerLevel = hungerLevel;
        this.urgeToSteal = urgeToSteal;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = boredomLevel;
    }


    public String getname() {
        return name;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getUrgeToSteal() {
        return urgeToSteal;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public int getBoredomLevel() {
        return boredomLevel;
    }


    public void greeting() {
        System.out.println(name + "'s hunger level is " + hungerLevel + " and his thirst level is " + thirstLevel);
        System.out.println(name + "'s thirst level is " + thirstLevel + " and his urge to steal is " + urgeToSteal);

    }

    public void feed() {
        hungerLevel = -1;
    }
    public void water() {
        thirstLevel = -1;
    }
    public void play() {
        boredomLevel = -1;
    }

    public void tick() {
        hungerLevel++;
        thirstLevel++;
        boredomLevel++;
        //want to make boredom level random between 1 and 10

        if (hungerLevel > 5) {
            urgeToSteal++;
        }
        if (thirstLevel > 5) {
            urgeToSteal++;
        }
        if (boredomLevel > 5) {
            // TODO: 5/25/22 add boredom level randomized
            // int thirstLevel;
            // if (true)
        }

    }


    // public static Clock tick(Clock baseClock, Duration tickDuration) {

    //}


    //public void water() {
    //}

   // public void play() {
    //}

}
// private int hungerLevel(do this through passage of time tick() and or through importing the clock);


//create another class? that details what you have in your house.
//if the urge to steal gets above 5... you lose something
//you only have so many things. you lose if everything is stolen
//steal food can't eat... steal phone can't call animal control