package InheritanceDemo;

public class Reptile extends Animal{
    private boolean hasScales;
    private int pounds;
    private boolean canSwim;
    

    public Reptile(){
        super(true,0,"carnivore");
    }

    public Reptile(boolean beingDangerous, int numberOfLegs, String diet, boolean hasScales, int pounds, boolean canSwim) {
        super(true, 0, "carnivore");
        this.hasScales = hasScales;
        this.pounds = pounds;
        this.canSwim = canSwim;
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
