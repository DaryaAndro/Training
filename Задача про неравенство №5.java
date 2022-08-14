import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      double a = 5; //первое число
      double b = 6; //второе число
      double c = 8; //третье число
      
      boolean disparity1 = ((a<b) && (b<c));
      boolean disparity2 = ((b>a) && (a>c));
      
      if(disparity1){
        System.out.println("Неравенство выполняется");
      }
      else{
        System.out.println("Неравенство не выполняется");
      }
      
      if(disparity2){
        System.out.println("Неравенство выполняется");
      }
      else{
        System.out.println("Неравенство не выполняется");
      }
    }
}

