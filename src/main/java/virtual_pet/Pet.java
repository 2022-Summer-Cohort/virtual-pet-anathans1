package virtual_pet;

public abstract class Pet {

    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void greeting();

    public abstract void feed();

    public abstract void water();

    public abstract void play();

    public abstract void walk();

    public abstract void changeOil();

    public abstract void fix();

//public abstract boolean isAlive();
//TODO make an is alive function in the second heratage of functions using the || within the parameters
}



