package Strategy.Fly;

import Interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("No vuela");
    }
}
