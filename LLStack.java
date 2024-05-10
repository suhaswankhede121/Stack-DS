
class Node{
    Node next;
    int data;
    Node(int data){
       this.data=data;
    }
}
class LL{
    Node head,tail;

    boolean isEmpty(){
        return head==null;
    }
    void push(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    int pop(){
        if(isEmpty()) return -1;
        int top=head.data;
        head=head.next;
        return top;

    }
    int peek(){
        if(isEmpty()) return -1;
        return head.data;
    }
}

public class LLStack {
    
   public static void main(String[] args) {
    LL list=new LL();
    list.push(1);
    list.push(2);
    list.push(3);
    while(!list.isEmpty()){
        System.out.println(list.peek());
        list.pop();
    }
   }

}
