package HW3;



import java.util.Scanner;

public class Phone {
public static  long chekNum()throws Exception{    
            
while (true){  
Scanner scanner = new Scanner(System.in);           

try{  
 System.out.println("Enter phone please: ");
  Long num = scanner.nextLong();
 return  num;
                
} catch (Exception e) {
System.out.println("This not number, try again please");
}
            
    }
    
}  
}
