import java.util.*;

public class Matrices2Darrays{
    public static int maxKey(int matrix[][]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                max=Math.max(max,matrix[i][j]);
            }
        }
        return max;
    }
    public static int minKey(int matrix[][]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                min=Math.min(min,matrix[i][j]);
            }
        }
        return min;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[3][3];
        System.out.println("Enter matrix elements:");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(maxKey(matrix));
        System.out.println(minKey(matrix));
    }
}