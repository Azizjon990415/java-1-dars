package uz.lab;

public class datatype {
    public static void main(String[] args) {
        boolean b = false;//true

        //butun sonlar
        byte by= 127;
        short s = 12323;
        int i = 34;
        long l = 34;
        //haqiqiy sonlar
        float f = 34.4f;
        double d = 3.5;

        char c = '$';


        System.out.println(Byte.SIZE / 8 +"byte");
        System.out.println(Short.SIZE / 8 +"byte");
        System.out.println(Integer.SIZE / 8 +"byte");
        System.out.println(Long.SIZE / 8 +"byte");
        System.out.println(Float.SIZE / 8 +"byte");
        System.out.println(Double.SIZE / 8 +"byte");
        System.out.println(Character.SIZE /  8 +"byte");

    }
}
