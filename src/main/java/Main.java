import beepers.Beeper;
import beepers.FancyMusic;
import beepers.Horn;
import beepers.MagicSparks;
import consoles.Console;
import consoles.PS5;
import consoles.XOneX;
import engines.Engine12V;
import engines.FSDEngine;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Beeper horn = new Horn();
        Beeper music = new FancyMusic();
        Beeper magic = new MagicSparks();

        Engine12V engine12V = new Engine12V();

        Console ps5 = new PS5();
        Console xonex = new XOneX();

        Lambo lambo = new Lambo(magic, engine12V, ps5);
        Viper viper = new Viper(music, new FSDEngine(), xonex);


        ArrayList<Car> carList = new ArrayList<Car>();
        carList.add(viper);
        carList.add(lambo);

        for (int i = 0; i < carList.size(); i++){
            System.out.println(carList.get(i).checkSpeed());
            System.out.println(carList.get(i).checkBeep());
            System.out.println(carList.get(i).checkConsole());
        }
    }
}
