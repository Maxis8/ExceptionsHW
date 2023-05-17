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
    
    
    
    
    
    
    
    
    // public static char getSex()throws Exception{      
    //     Scanner scanner = new Scanner(System.in);
            
        
    //     char s ='0';    
       
    //     while(true){ 
            
    //         try
    //     {
    //         // Scanner scanner = new Scanner(System.in);
    //         System.out.println("Specify the gender f or m: ");
    //         s = scanner.next ().charAt (0);  
    //         // scanner.close();
    //          if(s == 'm' || s == 'f'){ 
    //         // String sx = Character.toString(s);
            
    //         return s;
    //     }System.out.println("Try again");
    // }
    //         // else System.out.println("Try again");
    //     catch (Exception e) {
    //         System.out.println("Errrrrrooooooorrrrrr");
    //     }
        
        
    // }

    // }
        
   
     

             

