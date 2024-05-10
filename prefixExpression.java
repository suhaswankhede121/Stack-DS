import java.util.Stack;

public class prefixExpression {
    public static void main(String[] args) {
        String str="9-(3+5)*4/6";//
        Stack<String> val=new Stack<>();
        Stack<Character> ope=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int ascii=(int) ch;
            if(ascii>=48 && ascii<=57) {
                String s=""+ch;
                val.push(s);
            }
            else if(ope.size()==0 || ch=='(' || ope.peek()=='(') ope.push(ch);
            else if(ch==')'){ 
                while(ope.peek()!='('){
                    //work
                    String v2=val.pop();
                    String v1=val.pop();
                    char o=ope.pop();
                    String t=o+v2+v1;
                    val.push(t);
                }
                ope.pop();
            }else{
                if(ch=='+' || ch=='-'){
                    String v2=val.pop();
                    String v1=val.pop();
                    char o=ope.pop();
                    String t=o+v2+v1;
                    val.push(t);
                    ope.push(ch);
                }
                if(ch=='*' || ch=='/'){
                    String v2=val.pop();
                    String v1=val.pop();
                    char o=ope.pop();
                    String t=o+v2+v1;
                    val.push(t);
                        ope.push(ch);
                    }else{
                        ope.push(ch);
                    } 
                 }
                   
            }
        while(val.size()>1){
            String v2=val.pop();
            String v1=val.pop();
            char o=ope.pop();
            String t=o+v2+v1;
            val.push(t);
            ope.pop();
        }
        System.out.println(val.peek());
    }
    }
