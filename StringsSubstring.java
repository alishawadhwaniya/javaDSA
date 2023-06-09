//given starting index and ending index print the substring.
public class StringsSubstring{
    public static void printSubstring(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        System.out.println(substr);
    }
    public static void main(String[] args){
        String str="Hello World";
        printSubstring(str,0,5);
    }
}