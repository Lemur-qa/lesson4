import beepers.Beeper;
import consoles.Console;
import engines.Engine;
import led.Led;

public abstract class Car {
    private Led led;
    private Beeper beeper;
    private Engine engine;
    private Console console;

    public Car(Beeper beeper, Engine engine, Console console, Led led) {
        this.beeper = beeper;
        this.engine = engine;
        this.console = console;
        this.led = led;
    }
    public String checkBeep() {
        return beeper.makeSound();
    }
    public String checkSpeed(){
        return engine.makeRotation();
    }
    public String checkConsole(){
        return console.makePlay();
    }
    public String checkLights(){
        return led.makeLights();
    }
}
