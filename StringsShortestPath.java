// Given a route containing 4 directions(E,W,N,S),find the shortest path to reach destination."WNEENESENNN"

public class StringsShortestPath{

    public static float shortestPath(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) =='S'){
                y--;
            }
            else if(str.charAt(i) =='N'){
                y++;
            }
            else if(str.charAt(i) =='W'){
                x--;
            }
            else{
                x++;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
    }

    public static void main(String[] args){
        String str="WNEENESENNN";
        System.out.println(shortestPath(str));
    }
}