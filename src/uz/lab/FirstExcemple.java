package uz.lab;

import java.util.Scanner;

public class FirstExcemple {
    public static void main(String[] args){
//        System.out.println(4+5);
//        System.out.println(7-5);
//        System.out.println(7*5);
//        System.out.println(75/5);
//        System.out.println(4 * 3 + 9 / 3 - 3 * 5);
//      int i = 6 ;
//      // i = i + 1 ++i
//        System.out.println(++i);
//        System.out.println(i);
//        System.out.println(i--);


        Scanner Scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("birinchi sonni kriting = ");
        int a = Scanner.nextInt();
        System.out.println();
        System.out.println("ikkinchi sonni kriting = ");
        int b = Scanner.nextInt();

        System.out.println(a + b);
        System.out.println( (a > b) +" a > b");
        System.out.println( (a < b) +" a < b");




}
}
