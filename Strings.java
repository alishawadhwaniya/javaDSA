import java.util.*;

public class Strings{
    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args){
        char arr[]={'a','b','c','d'};
        String str="abcd";
        String str2=new String("xyz");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        sc.nextLine();
        String fullName=sc.nextLine();
        System.out.println(name);
        System.out.println(fullName);
        System.out.println(fullName.length());
        System.out.println(fullName.charAt(0));
        printLetters(fullName);
    }
}