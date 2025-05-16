package Strategy.Dive;
import Interfaces.DiveBehavior;

public class CannotDive implements DiveBehavior {
    public void dive() {
    System.out.println("No bucea");
}
}
