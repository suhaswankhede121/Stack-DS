import java.util.Stack;

public class RemoveConsecutiveSubsequences {
    static int[] subSequence(int[]arr){
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(st.size()==0 || st.peek()!=arr[i]) st.push(arr[i]);
            else if(arr[i]==st.peek()){
               if(i==arr.length-1 || arr[i]!=arr[i+1]){
                st.pop();
               }
            }
        }
        int result[]=new int[st.size()];
        for(int i=result.length-1;i>=0;i--){
            result[i]=st.pop();
        }
        return result;
    }
    public static void main(String[] args) {
        int []arr={1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int result[]=subSequence(arr);
        for(int i=0;i<result.length;i++){
            System.out.print(" "+result[i]);
        }
    }
}
