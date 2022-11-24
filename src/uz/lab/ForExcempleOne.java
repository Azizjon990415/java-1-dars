package uz.lab;

import java.util.Scanner;

public class ForExcempleOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        //1+2+3+4+...110+111
        int sum=1;
        for (int i = 1; i <=n ; i++) {
     //     sum=sum+i;
            sum*=i;



        }
        System.out.println( sum);
    }
}
