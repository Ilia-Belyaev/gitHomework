package lesson4;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date of creation: 21.12.2020
 */

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Honda", 5, "Black");
//        Car car2 = new Car("UAZ", 3, "Red");
//        Car car3 = new Car();
//
        System.out.println(car1.getModel());
        System.out.println(car1.getCountWheels());
        System.out.println(car1.getColor());
        car1.setColor("Yellow");
//
//        car3.setColor("Yellow");
//        System.out.println(car3.getColor());

//        car1.countWheels = 5;
//        car1.color = "Black";
//
//        car2.model = "UAZ";
//        car2.countWheels = 3;
//        car2.color = "Red";
//        System.out.println(car3.getModel());
//        System.out.println(car3.countWheels);

//        System.out.println("Car1 model " + car1.getModel());
//        System.out.println("Car1 countWh " + car1.countWheels);
//        System.out.println("Car1 color " + car1.color);
//
//        System.out.println("Car2 model " + car2.getModel());
//        System.out.println("Car2 countWh " + car2.countWheels);
//        System.out.println("Car2 color " + car2.color);

//        car1.move();
//        car1.beep();
//
//        car2.move();
//        car2.beep();
//        Car.voice();
//
//
//        System.out.println(Car.countWindow);
//        System.out.println(Car.countWindow);

    }
}

//1 Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
//2 Конструктор класса должен заполнять эти поля при создании объекта;
//3 Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
//4 Вывести при помощи методов из пункта 3 ФИО и должность.
//5 Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
//6* Создать метод, повышающий зарплату всем сотрудникам старше 35 лет на 10000;
//7** При создании экземпляра класса Сотрудник присваивать ему уникальный порядковый номер.
