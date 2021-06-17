package creatures;

public class Pet extends Animal {
    private int wiek;
    public Pet(String species,  int wiek) {
        super(species);
        this.wiek = wiek;
    }
}
