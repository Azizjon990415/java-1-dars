package uz.lab;

public class kabisayil {

    public static void main(String[] args) {
     int year=2022; //berilgan yil
         if((year % 4 ==0) && (year % 100 !=0)||(year % 400==0))
    {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}