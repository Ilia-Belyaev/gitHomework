package lesson5.lection5.models;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date of creation: 24.12.2020
 */

public abstract class Hero {

    protected String name;
    protected int hp;
    protected int mp;
    protected int atk;

    public Hero(String name, int hp, int mp, int atk) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.atk = atk;
    }

    public void attack() {
        System.out.println(name + " has attack " +  atk);
    }

    public void block() {
        System.out.println(name + " has block");
    }

    abstract protected void heal(int hp);
}
