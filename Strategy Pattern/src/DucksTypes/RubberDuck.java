package DucksTypes;
import Strategy.Fly.FlyWithWings;
import Strategy.Quack.Quack;

public class RubberDuck extends Duck{
    public RubberDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display() {
        System.out.println("Pato de hule");
    }

}
