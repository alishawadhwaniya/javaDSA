// search the given key in row-wise and col-wise sorted matrix..
public class StaircaseSearch2Darrays{
    public static boolean StaircaseSearch(int matrix[][],int key){
        int row=matrix.length-1,col=0;
        while(row>=0&&col<matrix[0].length){
            if(matrix[row][col]==key){
                System.out.println("Key found at ("+row+","+col+")");
                return true;
            }else if(key<matrix[row][col]){
                row--;
            }else{
                col++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String[] args){
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        int key=29;
        StaircaseSearch(matrix,key);
    }
}