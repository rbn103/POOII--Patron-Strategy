package Strategy.Quack;

import Interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("No grazna");
    }
}

