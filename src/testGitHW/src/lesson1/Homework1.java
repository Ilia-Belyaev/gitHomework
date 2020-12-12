package lesson1;

public class Homework1 {
    public static void main(String[] args){
        System.out.println(numbers(5,10,15,2));
        System.out.println(sumNumber(5,24));
        System.out.println(moreLess(5));
        System.out.println(yourName("Илья"));
        System.out.println(newYear(1210));
    }
    //Задание 1
    public static double numbers(int a, int b, int c, int d){
        return a*(b+(c/d));
    }
    //Задание 2
    public static boolean sumNumber(int a, int b){
        if ((a+b>=10)&(a+b<=20)){
            return true;
        }else{
            return false;
        }
    }
    //Задание 3
    public static String moreLess(int a){
        if (a>=0){
            return "Число больше 0";
        }else{
            return "Число меньше 0";
        }
    }
    //Задание 4
    public static String yourName(String a){
        return "Привет, " + a + "!";
    }
    //Задание 5
    public static String newYear(int a){
        if (((a%100!=0)&&(a%4==0))||(a%400==0)){
            return "Год " + a + " является високосным";
        }else {
            return "Год " + a + " не является високосным";
        }
    }
}
