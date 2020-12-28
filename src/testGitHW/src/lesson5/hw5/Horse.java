package lesson5.hw5;

public class Horse extends Animals{
    public Horse(String name){
        super(name);
        this.run = 1500;
        this.swim = 100;
        this.jump = 3;
    }
    //@Override
    public String running(int a) {
        if (a<(int)(Math.random()*(run+1))){
            return "Лошадь " + name + " смогла пробежать " + a + " метров.";
        }else {
            return "Лошадь " + name + " не смогла пробежать.";
        }
    }
    //@Override
    public String jumping(double a) {
        if (a<(double)(Math.random()*(jump+1))){
            return "Лошадь " + name + " смогла прыгнуть на " + a + " метров.";
        }else {
            return "Лошадь " + name + " не смогла прыгнуть.";
        }
    }
    //@Override
    public String swimming(int a) {
        if (a<(int)(Math.random()*(swim+1))){
            return "Лошадь " + name + " смогла проплыть " + a + " метров.";
        }else {
            return "Лошадь " + name + " не смогла проплыть";
        }
    }
}
