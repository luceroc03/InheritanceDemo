package InheritanceDemo;

public class Mammal extends Animal {
    private boolean hasFur;
    private boolean givesBirth;

    public Mammal(){
        super(false,4,"omnivore");
    }

    public Mammal(boolean beingDangerous, int numberOfLegs, String diet, boolean hasFur, boolean givesBirth) {
        super(false, 4, "omnivore");
        this.hasFur = hasFur;
        this.givesBirth = givesBirth;
    }
    @Override
    public void makeNoise(){
        super.makeNoise();
        System.out.println("meow");
    }
    @Override
    public void eat(){
        super.eat();
        System.out.println("tuna");
    }

}
