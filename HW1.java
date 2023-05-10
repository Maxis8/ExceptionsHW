public class HW1 {



    public static void main(String[] args){
    
        //System.out.println(sum());
        //System.out.println(sumlst());
        // System.out.println(lst());
        int lst1[] = {6,7,8,9};
        int lst2[] = {0,2,4,7};
    //    difference(lst1, lst2);
        divide(lst1,lst2);
    } 
    
    // Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

    private static int sum(){ 
        int a = 9;
        int b = 0;         //Exception in thread "main" java.lang.ArithmeticException: / by zero
        int s = a/b; 
        return s;
    }
    
    private static int sumlst(){
        int arr[] = {3,5,7,8};
        int sum = 0;
        for(int i = 0; i <= arr.length; i++){  //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
          sum += arr[i];
        }
          return sum;
    }

    private static int lst(){
        int sum = 0;
        int lst[]= null; //Exception in thread "main" java.lang.NullPointerException: Cannot read the array length because "lst" is null
        for(int i: lst){
            sum += i;
        }
        return sum;
    }




//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
// каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. 
// Если длины массивов не равны, необходимо как-то оповестить пользователя.

       private static void difference(int [] l1, int [] l2){
        int[] lst = new int[l1.length];
        
        for(int i =0; i < l1.length; i++){
            if (l1.length != l2.length)
                 throw new RuntimeException("the length of the arrays not equal");
            lst[i] = l1[i] - l2[i];
           
        }
        for(int j: lst){
            System.out.println(j);    
        }
       }

// * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
// и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. 
// Если длины массивов не равны, необходимо как-то оповестить пользователя. 
// Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
private static void divide(int[]ls1, int[] ls2) {
    if (ls1.length != ls2.length) {
        throw new RuntimeException("Длины массивов не равны");
    }
    int[] ls = new int[ls1.length];
    try {
        for (int i = 0; i < ls1.length; i++) {
            ls[i] = ls1[i] / ls2[i];
        }

    } catch (Exception e) {
        System.out.println(" WARNING !!! Exception !!!");
    }
    for(int j: ls){
        System.out.println(j);    
    }
    }
   }
    
    
    
       
     