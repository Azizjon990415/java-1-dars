package uz.lab;


import java.util.Scanner;

public class ForExcempleTubSonlar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                int n= scanner.nextInt();

            for (int i = 2; i <=n ; i++) {
            for (int j = 2; j <i ; j++) {
                if (i % j ==0){

                }
                
            }
                System.out.print(  i+  ",");
        }
    }
}
