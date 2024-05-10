import java.util.Stack;

public class InsrtBottom {
    static void insertAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return ;
        } 
        int top=s.pop();
        insertAtBottom(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        insertAtBottom(st, 4);
        System.out.println(st);
    }
}
