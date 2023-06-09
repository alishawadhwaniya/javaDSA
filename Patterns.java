public class Patterns{
    public static void HollowRectanglePattern(){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                if(i==1||i==4||j==1||j==5){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void InvertedHalfPyramid(){
        for(int i=1;i<=5;i++){
            for(int j=5;j>=1;j--){
                if(j<=i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void InvertedHalfPyramidNumbers(){
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void FloydsTriangle(){
        int a=0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                a=a+1;
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }

    public static void ZeroOneTriangle(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    public static void Butterfly(int n){
        // first half
        for(int i=1;i<=n;i++){
            // stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Second Half
        for(int i=n;i>=1;i--){
             // stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void SolidRhomus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void HollowRhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void Diamond(){
        for(int i=1;i<=4;i++){
            // spaces
            for(int j=3;j>=i;j--){
                System.out.print(" ");
            }
            // stars
            for(int j=1;j<=2*i-1;j++){
               System.out.print("*");
            }
            System.out.println();
        }
        for(int i=4;i>=1;i--){
            // spaces
            for(int j=3;j>=i;j--){
                System.out.print(" ");
            }
            // stars
            for(int j=1;j<=2*i-1;j++){
               System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        HollowRectanglePattern();
        InvertedHalfPyramid();
        InvertedHalfPyramidNumbers();
        FloydsTriangle();
        ZeroOneTriangle();
        Butterfly(4);
        SolidRhomus(5);
        HollowRhombus(5);
        Diamond();
    }
}