import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int score =2;
      
      switch (score)
      {
        case 0:
          System.out.println("Проигрыш");
          break;
        case 1:
          System.out.println("Ничья");
          break;
        case 3:
          System.out.println("Выигрыш");
          break;
          
          default:
          System.out.println("Результат не определен для такого количества очков");
          break;
      }
      
}
}
