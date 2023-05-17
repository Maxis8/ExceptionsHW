// Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке, разделенные пробелом:
// Фамилия Имя Отчество датарождения номертелефона пол
// Форматы данных:
// фамилия, имя, отчество - строки

// дата_рождения - строка формата dd.mm.yyyy

// номер_телефона - целое беззнаковое число без форматирования

// пол - символ латиницей f или m.

// Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым, 
// вернуть код ошибки, обработать его и показать пользователю сообщение, что он ввел меньше и больше данных, чем требуется.

// Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры. 
// Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы. Можно использовать встроенные типы java и создать свои. 
// Исключение должно быть корректно обработано, пользователю выведено сообщение с информацией, что именно неверно.

// Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, 
// в него в одну строку должны записаться полученные данные, вида

// <Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>

// Однофамильцы должны записаться в один и тот же файл, в отдельные строки.

// Не забудьте закрыть соединение с файлом.

// При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано, пользователь должен увидеть стектрейс ошибки.

package HW3;


import java.io.FileWriter;
import java.lang.Character.UnicodeBlock;
import java.nio.charset.Charset;

// import java.sql.Date;

import java.util.ArrayList;
import java.util.Scanner;



public class main {
   public static void main(String[] args) throws Exception  {
     
Scanner scanner = new Scanner(System.in,"Cp866");
ArrayList<String> fullData = new ArrayList<String>();
System.out.println("Enter a last name: ");
String lastname = scanner.nextLine();
 checkName(lastname);
fullData.add(lastname);
System.out.println("Enter a name: ");
String name = scanner.nextLine();
 checkName(name);
fullData.add(name);
System.out.println("Enter a father name: ");
String fname = scanner.nextLine();
 checkName(fname);
fullData.add(fname); 
    
String bday = Dateus.getDate(scanner);
fullData.add(bday);
    
long num = Phone.chekNum();
String tel = Long.toString(num);
fullData.add(tel);
    
char s = Sex.getSex(scanner);
String sex = Character.toString(s);
fullData.add(sex);
    
if(fullData.size() < 6)
    throw new RuntimeException("insufficient data");
    
scanner.close();
StringBuffer wrdate = new StringBuffer();
    for (String str : fullData) {
        wrdate.append(str + " ");
    }
scanner.close(); 
System.out.println(wrdate); 
         
     
try{ 
    FileWriter nFile = new FileWriter(lastname, Charset.forName("UTF8"), true);
    nFile.write(wrdate + "\n");
    nFile.close();
    }catch(Exception e){
        e.printStackTrace();
    }
    
}
public static String checkName(String name) {
        char[] chars = name.toCharArray();
        for (char c : chars) {
        if(UnicodeBlock.BASIC_LATIN.equals(UnicodeBlock.of(c))) 
        throw new IllegalArgumentException("Enter the name in letters " );
        }
    
        return name;
    }
}


        
        
        
    