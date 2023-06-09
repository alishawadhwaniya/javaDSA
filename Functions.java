import java.util.*;

public class Functions{
    public static int multiply(int a,int b){
        int product=a*b;
        return product;
    }
    public static int factorial(int n){
        int result=1;
        for(int i=1;i<=n;i++){
            result=result*i;
        }
        return result;
    }
    public static int binCoeff(int n,int r){
        int numFactorial=factorial(n);
        int rFactorial=factorial(r);
        int numminusrFac=factorial(n-r);
        int BC=numFactorial/(rFactorial*numminusrFac);
        return BC;
    }
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void printPrimes(int n){
        if(n==1){
            System.out.println("No prime nos");
        }else{
            for(int i=2;i<=n;i++){
                if(isPrime(i)){
                    System.out.println(i);
                }
            }
        }
    }
    public static int binaryToDecimal(int n){
        int decimal=0;
        int power=0;
        while(n!=0){
            int ld=n%10;
            decimal=(int) (decimal+ ld*Math.pow(2,power));
            power++;
            n=n/10;
        }
        return decimal;
    }
    public static int decimalToBinary(int n){
        int binary=0;
        int power=0;
        while(n!=0){
            int digit=n%2;
            binary=binary+ digit* (int)(Math.pow(10,power));
            power++;
            n=n/2;
        }
        return binary;
    }
    public static void main(String args[]){
        int prod=multiply(10,5);
        System.out.println("The product is "+ prod);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find factorial");
        int n=sc.nextInt();
        int result=factorial(n);
        System.out.println("Factorial of number is " + result);
        System.out.println("Enter two numbers to find Binomial Coefficient:");
        int num=sc.nextInt();
        int r=sc.nextInt();
        System.out.println("Binomial Coefficient is "+ binCoeff(num,r));
        System.out.println("Enter range for prime nos:");
        int range=sc.nextInt();
        printPrimes(range);
        System.out.println("Enter binary number:");
        int binNum=sc.nextInt();
        System.out.println("Decimal num is " + binaryToDecimal(binNum));
        System.out.println("Enter decimal number to convert to binary:");
        int decNum=sc.nextInt();
        System.out.println("Binary num is " + decimalToBinary(decNum));
    }
}