import beepers.Beeper;
import consoles.Console;
import engines.Engine;

public abstract class Car {
    private Beeper beeper;
    private Engine engine;
    private Console console;

    public Car(Beeper beeper, Engine engine, Console console) {
        this.beeper = beeper;
        this.engine = engine;
        this.console = console;
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
}
