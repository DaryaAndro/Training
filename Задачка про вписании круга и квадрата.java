import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      double S_cir = 4; //площадь круга
      double S_squ = 5; //площадь квадрата
      double D_cir = 2*Math.sqrt(S_cir/Math.PI); // диаметр круга
      double a = Math.sqrt(S_squ); //сторона квадрата
      double D_squ = Math.sqrt(2*S_squ); //диагональ квадрата
      
      //Уместится ли круг в квадрате?
      if(D_cir <= a) {
      System.out.println("Круг уместится в квадрат");
      }
      else {System.out.println("Круг не уместится в квадрат");
      }
      //Уместится ли квадрат в круге?
      if(D_cir >= D_squ) {
      System.out.println("Квадрат уместится в круг");
      }
      else {System.out.println("Квадрат не уместится в круг");
      }
}
}