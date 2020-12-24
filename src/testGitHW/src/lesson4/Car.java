package lesson04.online;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date of creation: 21.12.2020
 */

public class Car {

    private String model;
    private int countWheels;
    private String color;
    public static final int countWindow = 10;

    Car() {
        model = "Camry";
        countWheels= 4;
        color = "White";
    }

    Car(String model, int countWheels, String color) {
        this.model = model;
        this.countWheels = countWheels;
        this.color = color;
    }

    Car(String model) {
        this.model = model;
    }

    Car(String model, int count) {
        this.model = model;
        this.countWheels = count;
    }

    static class Motor {
        static int power = 400;
        int v = 5;

        void explosive() {
            System.out.println("I repair");
        }
    }

    void move() {
        System.out.println(model + " has moved");
    }

    void beep() {
        System.out.println(model + " beeeeep!!!");
    }

    static void voice() {
        System.out.println("Car has voice");
    }

    //Getter
    public String getModel() {
        return model;
    }

    public int getCountWheels() {
        return countWheels;
    }

    public String getColor() {
        return color;
    }

    //Setter
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public void setCountWheels(int countWheels) {
//        this.countWheels = countWheels;
//    }

    public void setColor(String color) {
        this.color = color;
    }
}
