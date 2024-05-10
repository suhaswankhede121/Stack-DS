import java.util.Stack;

public class IsDublicateParanthesis {
    static boolean isDublicate(String str){
        Stack<Character> st=new Stack<>();
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==')'){
                while(st.pop() !='(') {
                    count++;
                }
                if(count<1){
                    return true;
                }
            }else{
                st.push(ch);
            }

        }
        return false;
    }
    public static void main(String[] args) {
        String str="((a+b)+(c)))";
        String str1="((a+b)+(c+d))";//false
        System.out.println(isDublicate(str1));
        System.out.println(isDublicate(str));
    }
}
