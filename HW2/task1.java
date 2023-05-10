// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает 
// введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, 
// необходимо повторно запросить у пользователя ввод данных.

package HW2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] arr){
      
    System.out.println(Flonum());  
        
}
 private static float Flonum(){    
while (true) {
    System.out.println("Enter number type float:");
    try {  
        return new Scanner(System.in).nextFloat();
    } catch (Exception e) {
        System.out.println("This not number, try again please");
    }
}
 }
}
