import java.util.*;

public class Arrays{
    public static void printSubarrays(int numbers[]){
        int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;
        int sum=0;
        int totalSubarrays=0;
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                for(int k=i;k<=j;k++){
                    
                    System.out.print(numbers[k]+" ");
                    sum=sum+numbers[k];
                }
                totalSubarrays++;
                System.out.print(" "+sum);
                System.out.println();
                if(sum>maxSum){
                    maxSum=sum;
                }
                if(sum<minSum){
                    minSum=sum;
                }
                sum=0;
            }
            System.out.println();
        }
        System.out.println(totalSubarrays);
        System.out.println(minSum);
        System.out.println(maxSum);
    }
    public static void main(String[] args){
        int numbers []={2,4,6,8,10};
        printSubarrays(numbers);
    }
}