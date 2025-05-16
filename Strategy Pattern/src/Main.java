import DucksTypes.Duck;
import DucksTypes.MallardDuck;
import Strategy.Dive.Floats;
import Strategy.Fly.FlyWithJetPack;
import Strategy.Quack.Squeak;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.setFlyBehavior(new FlyWithJetPack());
        mallard.performFly();


        mallard.setQuackBehavior(new Squeak());
        mallard.performQuack();

        mallard.setDiveBehavior(new Floats());
        mallard.performDive();

    }
}