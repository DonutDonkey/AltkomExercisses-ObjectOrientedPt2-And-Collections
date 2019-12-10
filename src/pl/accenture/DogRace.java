package pl.accenture;

public class DogRace extends DogOrigin {
    String race;
    public String getRace() { return race; }

    public DogRace(String name, String origin, String race) {
        super(name, origin);
        this.race = race;
    }
}
