package HW3;

import java.util.Scanner;

public class Sex {
    public static char getSex(Scanner s)throws Exception{      
    
        
       while(true){ 
            
        try
        {
            
            System.out.println("Specify the gender f or m: ");
            char sx = s.next ().charAt (0);  
            if (sx=='f' || sx=='m'){
                return sx;
            }
            }catch (Exception e) {
            System.out.println("Error!");
        }
    }
    }
}
    
    
    
    
    
    
    
    
        
   
     

             

