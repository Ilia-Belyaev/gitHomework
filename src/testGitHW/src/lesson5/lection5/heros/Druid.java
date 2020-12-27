package lesson5.lection5.heros;

import lesson5.lection5.models.Hero;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date of creation: 24.12.2020
 */

public class Druid extends Hero {

    public Druid(String name, int hp, int mp, int atk) {
        super(name, hp, mp, atk);
    }

    @Override
    public void heal(int hp) {
        System.out.println(name + " dont heal self");
    }

}
