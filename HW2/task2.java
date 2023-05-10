// 2. Если необходимо, исправьте данный код 
// (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
// Дан следующий код, исправьте его там, где требуется (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
package HW2;

import java.io.FileNotFoundException;

public class task2 {
    public static void main(String[] args) throws Exception{
        // int intArray[] = {4,6,8,3,9,8,2,3,6};
        // try {
        //     int d = 0;
        //     double catchedRes1 = intArray[8] / d;
        //     System.out.println("catchedRes1 = " + catchedRes1);
        //  } catch (ArithmeticException e) {
        //     System.out.println("/ by zero" + e);
        //  } catch (ArrayIndexOutOfBoundsException e){
        //     System.out.println("ArrayIndexOutOfBoundsException: " + e);   
        //     }
            
        try {
            int a = 90;
            int b = 7;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
     }
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);  
             }
    
        }
    
    


   