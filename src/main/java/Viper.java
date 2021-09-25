import beepers.Beeper;
import consoles.Console;
import engines.Engine;
import led.Led;

public class Viper extends Car {

    public Viper(Beeper beeper, Engine engine, Console console, Led led) {
        super(beeper, engine, console, led);
    }
    public void scoopFuel() {
        System.out.println("Fuel scooped");
    }
    public void landToPlanet() {
        System.out.println("Vehicle landed");
    }
}
