package pl.accenture;

public interface IDog {
    static void bark() { System.out.println("bark bark!"); }

    default void playWithABall() {
        System.out.println(this.getClass().getSimpleName() + "Is playing with a ball");
    }
}
