package lesson5.hw5;

public class Bird extends Animals{
    public Bird(String name){
        super(name);
        this.run = 5;
        this.swim = 0;
        this.jump = 0.2;
    }
    //@Override
    public String running(int a) {
        if (a<(int)(Math.random()*(run+1))){
            return "Птичка " + name + " смогла пробежать " + a + " метров.";
        }else {
            return "Птичка " + name + " не смогла пробежать.";
        }
    }
   // @Override
    public String jumping(double a) {
        if (a<(double)(Math.random()*(jump+1))){
            return "Птичка " + name + " смогла прыгнуть на " + a + " метров.";
        }else {
            return "Птичка " + name + " не смогла прыгнуть.";
        }
    }
   // @Override
    public String swimming(int a) {
        if (a==swim){
            return "Птичка " + name + " смогла проплыть " + a + " метров.";
        }else {
            return "Птичка " + name + " не смогла проплыть";
        }
    }
}
