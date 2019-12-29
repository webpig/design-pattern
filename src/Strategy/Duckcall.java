package Strategy;

public class Duckcall {
    public Duckcall() {}

    public void quack() {
        QuackBehavior quackBehavior = new Quack();
        quackBehavior.quack();
    }
}
