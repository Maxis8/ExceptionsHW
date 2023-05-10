// 2. Если необходимо, исправьте данный код 
// (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

package HW2;

public class task2 {
    public static void main(String[] args){
        int intArray[] = {4,6,8,3,9,8,2,3,6};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e) {
            System.out.println("/ by zero" + e);
         } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException: " + e);   
            }
         
    }
    
}
