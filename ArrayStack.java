class StackArray{
    int []arr=new int[5];
    int index;
    void push(int data){
        arr[index]=data;
        index++;
    }
    int pop(){
        if(index==0) return -1;
        int top=arr[index-1];
        arr[index-1]=0;
        index--;
        return top;
    }
    int peek(){
        if(index==0) return -1;
        return arr[index-1];
    }
    int size(){
        return index;
    }
    boolean isEmpty(){
        if(size()==0){
           return true;
        }
        return false;
    }
    boolean isFull(){
        if(size()==arr.length){
            return true;
        }
        return false;
    }
    int capacity(){
        return arr.length;
    }
    void display(){
        for(int i=0;i<index;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }

}
public class ArrayStack {
    public static void main(String[] args) {
        StackArray st=new StackArray();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.display();
        st.pop();
        st.display();
        System.out.println(st.peek());
        System.out.println(st.capacity());
        System.out.println(st.size());
    }
}
