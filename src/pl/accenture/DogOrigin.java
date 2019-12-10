package pl.accenture;

public class DogOrigin extends Dog {
    String origin;
    public String getOrigin() { return origin; }

    public DogOrigin(String name, String origin) {
        super(name);
        this.origin = origin;
    }
}
