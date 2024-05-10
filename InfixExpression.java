
import java.util.Stack;

public class InfixExpression {
    public static void main(String[] args) {
        String str="9-(3+5)*4/6";//
        Stack<Integer> val=new Stack<>();
        Stack<Character> ope=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int ascii=(int) ch;
            if(ascii>=48 && ascii<=57) val.push(ascii-48);
            else if(ope.size()==0 || ch=='(' || ope.peek()=='(') ope.push(ch);
            else if(ch==')'){ 
                while(ope.peek()!='('){
                    //work
                    int v2=val.pop();
                    int v1=val.pop();
                    if(ope.peek()=='-') val.push(v2-v1);
                    if(ope.peek()=='+') val.push(v2+v1);
                    if(ope.peek()=='*') val.push(v2*v1);
                    if(ope.peek()=='/') val.push(v2/v1);
                    ope.pop();
                }
                ope.pop();
            }else{
                if(ch=='+' || ch=='-'){
                    int v2=val.pop();
                    int v1=val.pop();
                    if(ope.peek()=='-') val.push(v2-v1);
                    if(ope.peek()=='+') val.push(v2+v1);
                    if(ope.peek()=='*') val.push(v2*v1);
                    if(ope.peek()=='/') val.push(v2/v1);
                    ope.pop();
                    ope.push(ch);
                }
                if(ch=='*' || ch=='/'){
                    if(ope.peek()=='*' || ope.peek()=='/'){
                        int v2=val.pop();
                        int v1=val.pop();
                        if(ope.peek()=='*') val.push(v2*v1);
                        if(ope.peek()=='/') val.push(v2/v1);
                        ope.pop();
                        ope.push(ch);
                    }else{
                        ope.push(ch);
                    } 
                 }
                   
            }
        }

        while(val.size()>1){
            int v2=val.pop();
            int v1=val.pop();
            if(ope.peek()=='-') val.push(v2-v1);
            if(ope.peek()=='+') val.push(v2+v1);
            if(ope.peek()=='*') val.push(v2*v1);
            if(ope.peek()=='/') val.push(v2/v1);
            ope.pop();
        }
        System.out.println(val.peek());
    }
}
