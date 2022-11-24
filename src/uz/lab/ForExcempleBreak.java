package uz.lab;

public class ForExcempleBreak {
    public static void main(String[] args) {
        for (int i = 1; i <48 ; i++) {
            System.out.print(i+ " ");
            if (i==25){
                break;
            }
            
        }
      out:  for (int i = 1; i <=15 ; i++) {
            System.out.println("---------");
            for (int j = 1; j <10 ; j++) {
                System.out.println(j);
                System.out.println();
            }
              if (i==5){
                  continue out;
            }
            
        }
    }
}
