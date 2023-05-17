package HW3;


import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Dateus {
  public  static String getDate(Scanner s)throws Exception { 
        
SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
formatter.setLenient(false);
System.out.println(" Enter a Birthday (mm/dd/yyyy)");
                
while(true) {   
                  
try{
System.out.println("Please correct  data enter  (mm/dd/yyyy)");
String uDate = s.nextLine();
formatter.parse(uDate);

return uDate;

}catch(Exception ex){
 System.out.println(" is not a valid Date" );
                    
   }
 }    
}
}