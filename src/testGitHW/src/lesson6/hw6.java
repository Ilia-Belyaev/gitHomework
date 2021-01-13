package lesson6;

import jdk.internal.dynalink.beans.StaticClass;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;
import java.util.Random;
public class hw6 {
    public static String[] alphabet = {"a","b","c","d","e","e","f","g","h","i","g","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"," ","1","2","3","4","5","6","7","8","9","0"};
    public static int symbols = 150;
    public static String sumText;
    public static void main(String[] args) {
        fos("text1.txt");
        fos("text2.txt");
        System.out.println(fis("text1.txt"));
        //System.out.println(sumText);
        System.out.println(fis("text2.txt"));
        //System.out.println(sumText);
        fosSum("text3.txt");
        System.out.println(find("ae1"));
    }
    public static void fos(String a) {
        try {
            for (int i = 0; i < symbols; i++) {
                FileOutputStream fos = new FileOutputStream(a,true);
                byte[] str = alphabet[(int)(Math.random()*alphabet.length)].getBytes();
                fos.write(str);
                fos.close();
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    public static String fis(String a) {

        try {
            FileInputStream fis = new FileInputStream(a);
            int outbox;
            String str = "";
            while ((outbox = fis.read()) != -1) {
                str = str + (char) outbox;
            }
            fis.close();
            if (a=="text2.txt"){
                sumText = sumText + str;
            }else {
                sumText = str;
            }
            return str;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return " ";
    }
    public static void fosSum(String a) {
        try {
                FileOutputStream fos = new FileOutputStream(a,true);
                byte[] str = sumText.getBytes();
                fos.write(str);
                fos.close();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
    public static boolean find(String b){
        int str1 =sumText.indexOf(b);
        if (str1 == -1){
            return false;
        }else {
            return true;
        }
    }



    }


