package DucksTypes;

import Interfaces.DiveBehavior;
import Interfaces.FlyBehavior;
import Interfaces.QuackBehavior;

public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;
    DiveBehavior diveBehavior;
    public Duck(){}

    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }
    public void performFly() {
        flyBehavior.fly();
    }
    public void performDive() {
        diveBehavior.dive();
    }
    public void setQuackBehavior(QuackBehavior qB) {
        quackBehavior = qB;
    }

    public void setFlyBehavior(FlyBehavior fB) {
        flyBehavior = fB;
    }
    public void setDiveBehavior(DiveBehavior dB) {
        diveBehavior = dB;
    }


}
