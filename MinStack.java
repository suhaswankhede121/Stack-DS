import java.util.Stack;

class MinStack{
    Stack<Integer> st=new Stack<>();
    Stack<Integer> min=new Stack<>();
    
    MinStack(){

    }

    public void push(int val){
        if(st.size()==0){
            st.push(val);
            min.push(val);
        }else{
            st.push(val);
            if(min.peek()<val) min.push(min.peek());
            else min.push(val);
        }
    }

    void pop(){
        st.pop();
        min.pop();
    }
    int top(){
        return st.peek();
    }
    int getMin(){
        return min.peek();
    }
}