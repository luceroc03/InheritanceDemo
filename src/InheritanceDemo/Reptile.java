package InheritanceDemo;

public class Reptile extends Animal{
    private boolean hasScales;
    private boolean hasNoLegs;
    private boolean livesInWater;

    public Reptile(){
        super(true,0,"carnivore");
    }

    public Reptile(boolean beingDangerous, int numberOfLegs, String diet, boolean hasScales, boolean hasNoLegs, boolean livesInWater) {
        super(true, 0, "carnivore");
        this.hasScales = hasScales;
        this.hasNoLegs = hasNoLegs;
        this.livesInWater = livesInWater;
    }

    @Override
    public void makeNoise(){
        super.makeNoise();
        System.out.println("hiss");
    }
    @Override
    public void eat(){
        super.eat();
        System.out.println("mice");
    }
}
