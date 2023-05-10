// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

package HW2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] arr){ 
    Stringem();
    
    }  
    private static String Stringem(){
    System.out.println("Enter string: ");
    Scanner scan = new Scanner(System.in);
    String st = scan.nextLine();
    if(st==""){ 
    throw new RuntimeException("String is empty, try again!");}
    else{System.out.println("You string: " + st);}
    return st;
}
}