import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      double weight = 68; // вес боксера
      
      if(weight < 60) {
        System.out.println("Легкий вес");
      }
      else
      if(weight < 75) {
        System.out.println("Средний вес");
      }
      else
      if(weight < 91) {
        System.out.println("Тяжелый вес");
      }
      else
      if(weight > 91) {
        System.out.println("Супертяжелый вес");
      }
      else { 
        System.out.println("Весовая категория не найдена для такого значения");
      }
    }
}
      