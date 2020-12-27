package lesson5.lection5.heros;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date of creation: 24.12.2020
 */

public class Titan extends Paladin {

    public Titan(String name, int hp, int mp, int atk, int dex) {
        super(name, hp, mp, atk, dex);
    }

    public void bigAttack() {
        System.out.println(name + " has big Attack");
    }

    @Override
    public void block(){
        System.out.println(name + " don't block");
    }

    @Override
    public void heal(int hp) {
        System.out.println(name + " dont heal self");
    }
}
