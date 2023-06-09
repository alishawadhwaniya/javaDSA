import java.util.*;

public class IncometaxCalc{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your income");
        int income =sc.nextInt();
        double tax;
        if(income<500000){
            tax=0;
        }else if(income >=500000 && income <=100000){
            tax=0.2*income;
        }else{
            tax=0.3*income;
        }
        System.out.println("Your tax is " +tax);
        System.out.println("Enter 3 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println(a);
        }else if(b>c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
        System.out.println("enter even or odd number");
        int num=sc.nextInt();
        String type=(num%2==0)?"even":"odd";
        System.out.println("the number is " + type);
    }
}