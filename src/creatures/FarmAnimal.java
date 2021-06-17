package creatures;

public class FarmAnimal extends Animal implements Edbile {
    private int animalsCount;
    public FarmAnimal(String species, int animalsCount) {
        super(species);
        this.animalsCount = animalsCount;
    }
    public void beEaten(){

    }
}
