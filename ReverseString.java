import java.util.Stack;

public class ReverseString {
    static String reverse(String str){
        Stack<Character> st=new Stack<>();
        int index=0;
        while(index<str.length()){
           char ch=str.charAt(index);
            st.push(ch);
            index++;
        }
        StringBuilder s=new StringBuilder("");
        while(!st.isEmpty()){
            char ch=st.pop();
            s.append(ch);
        }
        return s.toString();
        
    }
    public static void main(String[] args) {
        String str="abc";
        System.out.println(reverse(str));
    }
}
