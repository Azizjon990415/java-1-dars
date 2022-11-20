package uz.lab;

import java.util.Scanner;

public class IfExcemple {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 100000;
        System.out.println();
        System.out.print("bilet bormi");
         int b = scanner.nextInt();  // 0, 1 | 0 => yo'q,   1 => ha

         if ( b == 1 )
        {
            //bilet bor
            System.out.println();
            System.out.println("qo'shimcha bilet olasizmi");
            int b1 = scanner.nextInt();
            if (b1 == 1) {
                System.out.println();
                System.out.println("Farzandingizni yoshi");
                int years = scanner.nextInt();
                if (years <= 7) {
                    sum = sum + 0;
                } else if (years > 7 && years <= 18) {
                    sum = sum + sum / 2;
                }

               System.out.println("Jami tolanadigan pul =" + sum);
            }
        } else {
                System.out.println("Bilet yo'q pitakka boring");
        }
     }
    }
