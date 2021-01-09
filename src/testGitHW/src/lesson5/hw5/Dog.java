package lesson5.hw5;

public class Dog extends Animals{
    public Dog(String name){
        super(name);
        this.run = 500;
        this.swim = 10;
        this.jump = 0.5;
    }
    //@Override
    public String running(int a) {
        if (a<(double)(Math.random()*(run+1))){
            return "Собака " + name + " смогла пробежать " + a + " метров.";
        }else {
            return "Собака " + name + " не смогла пробежать.";
        }
    }
    //@Override
    public String jumping(double a) {
        if (a<(double)(Math.random()*(jump+1))){
            return "Собака " + name + " смогла прыгнуть на " + a + " метров.";
        }else {
            return "Собака " + name + " не смогла прыгнуть.";
        }
    }
    //@Override
    public String swimming(int a) {
        if (a<(int)(Math.random()*(swim+1))){
            return "Собака " + name + " смогла проплыть " + a + " метров.";
        }else {
            return "Собака " + name + " не смогла проплыть";
        }
    }
}
