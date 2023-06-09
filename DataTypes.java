import java.util.*;

public class DataTypes{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double radius=sc.nextDouble();
        double pi=3.14;
        double area=pi*radius*radius;
        System.out.println(area);
        System.out.println("Enter age:");
        int age =sc.nextInt();
        if(age>=18){
            System.out.println("adult");
        }else{
            System.out.println("not adult");
        }
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }
}