package lesson2;
import java.util.Arrays;
public class homeWork2 {
    public static void main(String[] args) {

                System.out.println("Задание 1. Массив: " + Arrays.toString(mass()));
                System.out.println("Задание 1. Преобразованный массив:" + Arrays.toString(mass1()));
                System.out.println("Задание 2: " + Arrays.toString(mass2()));
                System.out.println("Задание 3: " + Arrays.toString(mass3()));
                System.out.println("Задание 4: Максимальный элемент массива равен: " + maxElement());
                System.out.println("Задание 4: Минимальный элемент массива равен: " + minElement());
                System.out.println("Задание 5: вывести массив с 1 по диагоналям: ");
                for (int k=0;k<a;k++){
                    square();
                    System.out.println(Arrays.toString(arr[k]));
                }
                System.out.println("Задание 6: Исходный массив: " + Arrays.toString(massRand()) + ". Ответ на вопрос: " + mass4(arrayNumb));
                System.out.println("Задание 7: Исходный массив: " + Arrays.toString(massRand()) + ". Преобразованный массив: " + Arrays.toString(permutation(arrayNumb,-4)));
                //System.out.println("Задание 8: Исходный массив: " + Arrays.toString(massRand()) + "Преобразоанный массив(без вспомогательного): " + Arrays.toString(permutation1(arrayNumb,-4)));
            }

            public static int a = 10;
            public static int[] array = new int[a];
            public static int[] array1 = new int[a];
            public static int[] array2 = new int[8];
            public static int[] array3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
            public static int[][] arr = new int[a][a];
            public static int[] n = new int[8];
            public static int step = 3;
            public static int[] arrayNumb = new int[6];
            public static int[] massRand() {//случайный массив для 6 задания и 7 с 8
                for (int i = 0; i < arrayNumb.length; i++) {
                    arrayNumb[i] = (int) (Math.random() * 10);
                }
                return arrayNumb;
            }
            //Задание 1
            public static int[] mass(){
                for (int i =0;i<arrayNumb.length;i++){
                    arrayNumb[i] = (int)(Math.random()*2);
                }
                return arrayNumb;
            }
            public static int[] mass1(){
                for (int i=0;i<array1.length;i++) {
                    if (array[i] == 0) {
                        array1[i] = 1;
                    } else {
                        array1[i] = 0;
                    }
                }
                return array1;
            }
            //Задание 2
            public static int[] mass2(){
                int k=0;
                for(int i=0;i<array2.length;i++){
                    array2[i]= i+2*k+1;
                    k++;
                }
                return array2;
            }
            //Задание 3
            public static int[] mass3(){
                int[] array4 = new int[array3.length];
                for (int i=0;i<array3.length;i++){
                    if (array3[i]<6){
                        array4[i]=array3[i]*2;
                    }
                }
                return array3;
            }
            //Задание 4
            public static int maxElement(){
                int max = array3[0];
                for (int i=0;i<array3.length;i++){
                    if (array3[i]>=max){
                        max = array3[i];
                    }
                }
                return max;
            }
            public static int minElement() {
                int min = array3[0];
                for (int i = 0; i < array3.length; i++) {
                    if (array3[i]<=min) {
                        min = array3[i];
                    }
                }
                return min;
            }

            //Задание 5
            public static int[][] square() {
                for (int i=0;i<a;i++){
                    for (int j=0;j<a;j++){
                        arr[i][j]=(int)(Math.random()*10);
                        if ((i==j)||(i+j==a-1)){
                            arr[i][j]=1;
                        }
                        //System.out.print(arr[i][j]+ "\t");
                    }
                    //System.out.println();
                }
                return arr;
            }
            //Задание 6
            public static boolean mass4(int[] m){
                int sum=0;
                int sum1=0;
                boolean b = false;
                for (int i=0;i<m.length;i++){
                    sum=sum + m[i];
                }
                for (int j=0;j<m.length;j++){
                    sum1 = sum1+m[j];
                    if (sum1 ==(sum-sum1)){
//                    if (sum1>(sum-sum1)){//хотел выйти из цикла, если первая сумма будет больше оставшейся, но не до конца понял, как реализовать(чтобы не до конца цикла доходить, куда-то ещё break нужно засунуть)
//                        break;
//                    }
                        b = true;
                        break;
                    }else{
                        b = false;
                    }
                }
                return b;//придумать, как вывести boolean
            }
            //Задание 7
            public static int[] permutation(int[] m, int b) {
                int[] mass12 = new int[m.length];
                int j = 0;
                for (int i = 0; i < m.length; i++) {
                    int h = i + b;
                    if (b > 0) {
                        if (h > m.length) {
                            h = j;
                            j++;
                        }
                        mass12[h] = m[i];
                    } else if (b < 0) {
                        if (h < 0) {
                            h = m.length + h;
                        } else if (h >= 0) {
                            h = i + b;
                        }
                        mass12[h] = m[i];
                    }

                }
                return mass12;
            }
//            //Задание 8
//            public static int[] permutation1(int[] m, int b) {
//                int j = 0;
//                int k = 0;
//                for (int i = 0; i < m.length; i++) {
//                    int h = i + b;
//                    if (b > 0) {
//                        if (h > m.length) {
//                            h = j;
//                            j++;
//                        }
//
//                        mass12[h] = m[i];
//                    } else if (b < 0) {
//                        if (h < 0) {
//                            h = m.length + h;
//                        } else if (h >= 0) {
//                            h = i + b;
//                        }
//                        mass12[h] = m[i];
//                    }
//
//                }
//                return mass12;
//            }

        }


