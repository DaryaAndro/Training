import java.util.*;

public class Main {
    public static void main(String[] args) {
      double Cel = 36.6; //значение температуры по шкале Цельсия
      double Far = Cel*1.8+32; //находим значение температуры по шкале Фаренгейта
      double Kel = Cel+273.15; // находим значение температуры по шкале Кельвина
      String Far1 = String.format("%.2f",Far); //округляем значение температуры до двух знаков после запятой
      String Kel1 = String.format("%.2f",Kel); //округляем значение температуры до двух знаков после запятой
      
      System.out.println("Температура по шкале Фарингейта = " + Far1);
      System.out.println("Температура по шкале Кельвина = " + Kel1);
      
      
}
}

