package uz.lab;

import java.util.Scanner;

public class SwitchLesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        switch (n){
            case 1:System. out.println("Dushanba");break;
            case 2:System. out.println("Seyshanba");break;
            case 3:System. out.println("Chorshanba");break;
            case 4:System. out.println("Payshanba");break;
            case 5:System. out.println("Juma");break;
            case 6:System. out.println("Shanba");break;
            case 7:System. out.println("Yakshanba");break;
            default:
            System. out.println("Bunday hafta kuni yo'q");break;

        }

    }
}
