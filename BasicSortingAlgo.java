import java.util.*;

public class BasicSortingAlgo{
    public static void bubbleSort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            int swaps=0;
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swaps++;
                }
            }
            if(swaps==0){
                break;
            }
        }
    }
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minValPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minValPos]){
                    minValPos=j;
                }
            }
            //swap
            int temp=arr[i];
            arr[i]=arr[minValPos];
            arr[minValPos]=temp;
        }
    }
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            // finding out correct position to insert
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1]=curr;
        }
    }
    public static void countingSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        // calculating largest
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];
        // calculating frequency
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        // sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args){
        // int arr[]={5,4,1,3,2};
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        // Arrays.sort(arr);
        // Arrays.sort(arr,0,3);
        // Integer arr[]= {5,4,1,3,2};
        // Arrays.sort(arr,0,4,Collections.reverseOrder());
        int arr[]={1,4,1,3,2,4,3,7};
        countingSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}