import java.util.Stack;

public class NextGreater {
    static int [] nextGreater(int[]arr){
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int []ng=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ng[i]=-1;
            }else{
                ng[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return ng;
    }
    public static void main(String[] args) {
        int []arr={6,8,0,1,3};
        int []result=nextGreater(arr);
        for(int i=0;i<result.length;i++){
            System.out.print(" "+result[i]);
        }
    }
}
