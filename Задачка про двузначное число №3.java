import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int number = 11;
      
      int a = number / 10; //нахождение первой цифры двузначного числа
      int b = number % 10; //нахождение второй цифры двузначного числа
      int sum = a+b;
      
      // Является ли сумма его цифр двузначным числом?
      if((sum >10) && (sum <100)) {
        System.out.println("Сумма цифр числа является двузначным числом");
      }
      else {
        System.out.println("Сумма цифр числа НЕ является двузначным числом");
      }
      
      // Больше ли самого числа сумма его цифр?
      if(sum>number) {
        System.out.println("Сумма цифр числа больше самого числа");
      }
      else {
        System.out.println("Сумма цифр числа меньше самого числа");
      }
    }
}

