package uz.lab;

import java.util.Scanner;

public class ForExcempleTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        for (int i = 1; i <=n ; i++){
            if(i%3==0 && i%5==0){
                System.out.print
                        (i+ ",");
            }
        }
    }
}
