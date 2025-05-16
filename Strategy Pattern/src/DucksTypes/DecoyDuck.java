package DucksTypes;
import Strategy.Fly.FlyWithWings;
import Strategy.Quack.Quack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display() {
        System.out.println("Pato");
    }

}