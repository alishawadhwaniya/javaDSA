import java.util.*;

public class ArraysBuySellStocks{
    public static int calcMaxProfitSolution1(int prices[]){
        int rightMax[]=new int[prices.length];
        for(int i=0;i<prices.length;i++){
            int tempMax=prices[i];
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]>tempMax){
                    tempMax=prices[j];
                }
            }
            rightMax[i]=tempMax;
            // System.out.print(rightMax[i]);
        }
        int profit[]=new int[prices.length];
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            profit[i]=rightMax[i]-prices[i];
        }
        maxProfit=profit[0];
        for(int i=1;i<prices.length;i++){
            if(profit[i]>maxProfit){
                maxProfit=profit[i];
            }
        }
        return maxProfit;
    }
    public static int calcMaxProfitSolution2(int prices[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buyPrice){
                buyPrice=prices[i];
            }
            int profit=prices[i]-buyPrice;
            if(profit>maxProfit){
                maxProfit=profit;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args){
        int prices[]={7,1,5,3,6,4};
        int profit=calcMaxProfitSolution1(prices);
        System.out.println(profit);
        System.out.println(calcMaxProfitSolution2(prices));
    }
}