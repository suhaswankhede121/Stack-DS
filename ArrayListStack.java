import java.util.ArrayList;

class ArrayListStack{
    static class Stack1{
        static ArrayList<Integer> list=new ArrayList<>();
       static boolean isEmpty(){
         return list.size()==0;        
        }
        static void push(int data){
          list.add(data);
        }
        static int pop(){
        if(isEmpty()) return -1;
        int top=list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
        }
        static int peek(){
            if(isEmpty()) return -1;
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack1 st=new Stack1();
        st.push(1);
        st.push(2);
        st.push(3);

        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}