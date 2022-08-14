import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      double R = 2; //радиус круга
      double a = 25; //сторона квадрата
      double S_cir = Math.PI*Math.sqrt(R); //находим площадь круга
      double S_squ = Math.sqrt(a); //находим площадь квадрата
      
      if (S_cir > S_squ){ 
        System.out.println("Площадь круга больше");
      }
      else{
        System.out.println("Площадь квадрата больше");
      }
      }
      
}
