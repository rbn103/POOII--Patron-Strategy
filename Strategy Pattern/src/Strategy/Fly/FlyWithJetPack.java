package Strategy.Fly;

import Interfaces.FlyBehavior;

public class FlyWithJetPack implements FlyBehavior {
    public void fly() {
        System.out.println("Vuela con JetPack");
    }
}
