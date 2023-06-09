// for a given string covert each first letter of each word to uppercase.
public class StringsToUppercase{
    public static String convertToUppercase(String str){
        StringBuilder sb=new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                char capital=Character.toUpperCase(str.charAt(i));
                sb.append(capital);
            }else{
                sb.append(str.charAt(i));
            }
        }
        
        return sb.toString();
    }
    public static void main(String[] args){
        String str="hi i am alisha ";
        System.out.println(convertToUppercase(str));
    }
}