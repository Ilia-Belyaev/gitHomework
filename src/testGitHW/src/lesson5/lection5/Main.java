package lesson5.lection5;

import lesson5.lection5.heros.Druid;
import lesson5.lection5.heros.Paladin;
import lesson5.lection5.heros.Titan;
import lesson5.lection5.models.Hero;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date of creation: 24.12.2020
 */

public class Main {

    public static void main(String[] args) {

//        int i = 100;
//        byte b = (byte) i;

        Archer archer = new Archer("Archer", 100, 20, 15);
        Paladin paladin = new Paladin("Paladin", 150, 50, 50);
        Druid druid = new Druid("Druid", 75, 150, 40);

        Paladin killer = new Paladin("Killer", 200, 100, 500, 100);
        Hero titan = new Titan("Titan", 1000, 1000, 1500, 10);

        Hero[] attackGroup = {archer, paladin, druid, killer, titan};

//        for (int i = 0; i < attackGroup.length; i++) {
//            attackGroup[i].attack();
//            attackGroup[i].block();
//
//            if (attackGroup[i] instanceof Titan) {
////                Titan titan1 = (Titan) attackGroup[i];
////                titan1.bigAttack();
////                ((Titan) attackGroup[i]).bigAttack();
//            }

//        }


//        archer.attack();
//        paladin.attack();
//        druid.attack();
//        killer.attack();
//        druid.block();
//        titan.block();
//        druid.block();
//        titan.block();
//        titan.bigAttack();
//
//        archer.heal(15);
//        paladin.heal(20);

        int a = 5;
        String str = "hello";
        str.length();

//        String[] arrStr =new String[2];
//        arrStr[0] = a;

        Object[] arr = new Object[3];
        arr[0] = a;
        arr[1] = str;
        arr[2] = archer;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof String) {
                System.out.println(((String) arr[i]).length());
            }
        }
    }

}

/**
 1. Создать классы Собака, Лошадь, Птица и Кот с наследованием от класса Животное.

 2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
 В качестве параметра каждому методу передается величина, означающая или длину
 препятствия (для бега и плавания), или высоту (для прыжков).

 3. У каждого животного есть ограничения на действия
 (бег: кот 200 м., собака 500 м., Лошадь 1500 м., Птица 5 м.,;
 прыжок: кот 2 м., собака 0.5 м., Лошадь 3 м., Птица 0.2 м. ;
 плавание: кот и птица не умеет плавать, собака 10 м., лошадь 100 м.).

 4. При попытке животного выполнить одно из этих действий,
 оно должно сообщить результат.
 (Например, dog1.run(150); -> результат: 'Пёсик пробежал!')

 5. * Добавить животным разброс в ограничениях.
 То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.

 **/
