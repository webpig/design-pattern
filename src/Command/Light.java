package Command;

public class Light {
    String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " light is on!");
    }

    public void off() {
        System.out.println(name + " light is off!");
    }
}