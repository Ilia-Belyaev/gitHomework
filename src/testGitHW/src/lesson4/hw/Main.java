package lesson4;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        Workman worker1 = new Workman("Алексей", "Петров", "Алексеевич", "Директор","88005553535", 100500, 54);
        Workman worker2 = new Workman("Антон", "Сидоров", "Ильич", "Старший менеджер","88005554835", 20250, 24);
        Workman worker3 = new Workman("Александр", "Бурунов", "Константинович", "Системный администратор","88005599986", 51000, 27);
        Workman worker4 = new Workman("Дмитрий", "Козлов", "Петрович", "Аналитик","88039671535", 42100, 38);
        Workman worker5 = new Workman("Елена", "Иванова", "Ивановна", "Бухгалтер","88602863535", 34000, 42);
        Workman[] workers = new Workman[]{worker1,worker2,worker3,worker4,worker5};
        worker1.nLpp();
        System.out.println();
        for (int i=0;i< workers.length;i++){
            if (workers[i].getAge()>40){
                workers[i].allInf();
                System.out.println();
            };
        }
        System.out.println("Задание 6");
        for (int i = 0; i< workers.length;i++){
            if( workers[i].getAge()>35){
                workers[i].setMoney();
                workers[i].allInf();
                System.out.println();
            }
        }
    }

}
