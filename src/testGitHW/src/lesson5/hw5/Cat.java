package lesson5.hw5;

public class Cat extends Animals{

    public Cat(String name){
        super(name);
        this.run = 200;
        this.swim = 0;
        this.jump = 2;
    }
    //@Override
    public String running(int a) {
        if (a<(int)(Math.random()*(run+1))){
            return "Кошка " + name + " смогла пробежать " + a + " метров.";
        }else {
            return "Кошка " + name + " не смогла пробежать.";
        }
    }
    //@Override
    public String jumping(double a) {
        if (a<(double)(Math.random()*(jump+1))){
            return "Кошка " + name + " смогла прыгнуть на " + a + " метров.";
        }else {
            return "Кошка " + name + " не смогла прыгнуть.";
        }
    }
    //@Override
    public String swimming(int a) {
        if (a==swim){
            return "Кошка " + name + " смогла проплыть " + a + " метров.";
        }else {
            return "Кошка " + name + " не смогла проплыть";
        }
    }
}
