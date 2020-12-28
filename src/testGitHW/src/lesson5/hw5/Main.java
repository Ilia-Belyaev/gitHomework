package lesson5.hw5;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Маруська");
        Cat cat1 = new Cat("Манька");
        Dog dog = new Dog("Полкан");
        Bird bird = new Bird("Кеша");
        Bird bird1 = new Bird("Попугай");
        Horse horse = new Horse("Буцефал");
        //Задание 4,5
        System.out.println(bird.running(3));
        System.out.println(bird1.running(3));
        System.out.println(cat.running(200));
        System.out.println(cat1.running(100));
        System.out.println(horse.running(1000));
        System.out.println(dog.running(21));
        System.out.println();
        System.out.println(bird.swimming(5));
        System.out.println(cat.swimming(20));
        System.out.println(horse.swimming(100));
        System.out.println(dog.swimming(2));
        System.out.println();
        System.out.println(bird.jumping(0.3));
        System.out.println(cat.jumping(0.4));
        System.out.println(horse.jumping(1));
        System.out.println(dog.jumping(1));
    }


}


