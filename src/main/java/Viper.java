import beepers.Beeper;
import consoles.Console;
import engines.Engine;

public class Viper extends Car {

    public Viper(Beeper beeper, Engine engine, Console console) {
        super(beeper, engine, console);
    }
    public void scoopFuel() {
        System.out.println("Fuel scooped");
    }
    public void landToPlanet() {
        System.out.println("Vehicle landed");
    }
}
