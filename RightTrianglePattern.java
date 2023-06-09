public class RightTrianglePattern{
    public static void main(String args[]){
        for(int i=1;i<=4;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("Inverted right angle pattern:-");
        for(int i=5;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("Number half pyramid pattern:-");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
        System.out.println("Character half pyramid pattern:-");
        char c='A';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c);
                c++;
            }
            System.out.print("\n");
        }
    }
}