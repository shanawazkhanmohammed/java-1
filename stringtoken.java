import java.io.*;
import java.util.*;

public class stringtoken {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);    
    String s = scan.nextLine();
    String[] items = s.trim().split("[ !,?.\\_'@]+");

    if(s.length()>0){
    if(s.length() > 400000){
        return;
    }
    else{
       System.out.println(items.length);
    }}
    else{
        System.out.println(""); 
    }    

    for(String item: items){
        System.out.println(item);
    }
    scan.close();
}
}
