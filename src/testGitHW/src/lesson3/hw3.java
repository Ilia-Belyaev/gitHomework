package lesson3;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.Random;
public class hw3 {
    public static final char HUMAN = 'X';
    public static final char PC = '0';
    public static final char EMPTY = '_';
    public static char[][] map;
    public static int sizeY;
    public static int sizeX;
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final Random RANDOM = new Random();
    public static void initialization(){
        sizeY = 3;
        sizeX = 3;
        map = new char[sizeY][sizeX];
        for (int y = 0; y < sizeY; y++) {
            for (int x = 0; x < sizeX; x++) {
                map[y][x] = EMPTY;
            }
        }
    }
    public static void lookMap(){
        for (int y = 0; y < sizeY; y++) {
            System.out.print(y + 1 + "|");
            for (int x = 0; x < sizeX; x++) {
                System.out.print(map[y][x] + "|");
                if (y==sizeY-1 && x == sizeX-1){
                    System.out.println();
                    for (int z = 0; z < sizeX; z++) {
                        if (z==0) {
                            System.out.print("  " + (z + 1));
                        }else{
                            System.out.print(" " + (z + 1));
                        }
                    }

                }
            }
            System.out.println();
        }
    }//инициализация таблицы

    public static void turnHuman() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты");
            x = SCANNER.nextInt()-1;
            y = SCANNER.nextInt()-1;
        }while (!valid(y,x) || !empty(y,x));
            map[y][x] = HUMAN;
    }
    public static boolean valid(int y, int x){//проверка на выход из диапазона
        return (y >= 0 && y < sizeY && x >= 0 && x < sizeX);
    }

    public static void turnPC(){
        int x;
        int y;
        do{
            x = RANDOM.nextInt(sizeX);
            y = RANDOM.nextInt(sizeY);
        }while (!empty(y,x));
        map[y][x] = PC;
    }

    public static boolean empty(int y, int x){//проверка на незаполненность ячейки
        return map[y][x]==EMPTY;
    }
    public static boolean emptyMap(){//проверка на пустую карту
        for (int i = 0; i <sizeY ; i++) {
            for (int j = 0; j <sizeX ; j++) {
                if (map[j][i]==EMPTY ) return false;
            }
        }
        return true;
    }

    public static boolean checkWin(char choseGamer){// условия выигрыша

        int flag=0;
        int flag1=0;
        for (int i = 0; i < sizeY; i++) {
            int d = 0;
            for (int j = 0; j < sizeX; j++) {
               if((i==j || i+j==sizeX-1 || i+j==sizeY-1 ) && map[j][i] == choseGamer){
                   flag++;
               }else if(map[j][i]==choseGamer && i==d){//не работает
                    flag1++;
               }

            }
            d=d+1;
        }
//        if (map[0][0] == choseGamer && map[0][1] == choseGamer && map[0][2] == choseGamer) return true;
//        if (map[1][0] == choseGamer && map[1][1] == choseGamer && map[1][2] == choseGamer) return true;
//        if (map[2][0] == choseGamer && map[2][1] == choseGamer && map[2][2] == choseGamer) return true;
//
//        if (map[0][0] == choseGamer && map[1][0] == choseGamer && map[2][0] == choseGamer) return true;
//        if (map[0][1] == choseGamer && map[1][1] == choseGamer && map[2][1] == choseGamer) return true;
//        if (map[0][2] == choseGamer && map[1][2] == choseGamer && map[2][2] == choseGamer) return true;
        if (flag ==sizeY || flag ==sizeX ||flag1==sizeY || flag1==sizeX) return true;
        return false;
    }

    public static void main(String[] args) {
        initialization();// вывод таблицы на экран
        lookMap();
        while(true) {
            turnHuman();
            lookMap();
            if (checkWin(HUMAN)){
                System.out.println("Человек выиграл");
                break;
            }
            if (emptyMap() ==true){
                System.out.println("Ничья");
                break;
            }
            turnPC();
            lookMap();
            if (checkWin(PC)){
                System.out.println("Машина выиграла");
                break;
            }
            if (emptyMap() ==true){
                System.out.println("Ничья");
                break;
            }
        }
    }
}
