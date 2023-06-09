import java.util.*;

public class PrimeOrNot{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        boolean isPrime=true;
        if(num==2){
            System.out.println("Number is prime");
        }else{
            for(int i=2;i<=num-1;i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        if(!isPrime){
            System.out.println("Number is composite");
        }else{
            System.out.println("Number is prime");
        }
        }
    }
}