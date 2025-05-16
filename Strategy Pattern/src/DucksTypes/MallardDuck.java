package DucksTypes;
import Strategy.Fly.FlyWithWings;
import Strategy.Quack.Quack;
import Strategy.Dive.Dives;

public class MallardDuck extends Duck{
    public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
    diveBehavior = new Dives();
    }
    public void display() {
        System.out.println("Pato real");
    }

}
