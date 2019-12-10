package pl.accenture;

public class Dog implements IDog {
    String name;
    public void setName(String name) { this.name = name; }

    public Dog(String name) { this.name = name; }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
