import java.util.Stack;

public class ReverseStack {
     static void insertAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return ;
        } 
        int top=s.pop();
        insertAtBottom(s, data);
        s.push(top);
    }
    static void reverse(Stack<Integer> st){

        if(st.isEmpty()){
            return;
        }
        int top=st.pop();
        reverse(st);
        insertAtBottom(st, top);
    }
    static void Print(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        reverse(st);
        Print(st);
    }
}
