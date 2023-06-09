import java.util.*;
public class ArraysKadanes{
    public static void kadanes(int numbers[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        boolean isAllNegative=true;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>=0){
                isAllNegative=false;
            }
        }
        for(int i=0;i<numbers.length;i++){
            if(isAllNegative){
                ms=Math.max(numbers[i],ms);
            }else{
                cs=cs+numbers[i];
                if(cs<0){
                    cs=0;
                }
                ms=Math.max(cs,ms);
            }
        }
        System.out.println("Max Subarray sum is: "+ ms);
    }
    public static void main(String[] args){
        int numbers[]={-1,-2,-3,-4};
        kadanes(numbers);
    }
}