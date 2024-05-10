import java.util.Stack;

public class CelebratyProblem {
    static int matrix(int[][]m){
        Stack<Integer> st=new Stack<>();
       for(int i=0;i<m.length;i++){
          st.push(i);
       }

       if(st.size()==0) return -1;
       
       while(st.size()>1){
        int v1=st.pop();
        int v2=st.pop();
        if(m[v1][v2]==0) st.push(v1); // shayd v1 cele ho sakta hai but v2 bilkul nh
        else if(m[v2][v1]==0) st.push(v2); //viz
       }
       int potential=st.pop();
       for(int j=0;j<m.length;j++){
           if(m[potential][j]==1)  return -1;
       }
       for(int i=0;i<m.length;i++){
        if(m[i][potential]==0)  return -1;
       }
       return potential;
    }
    public static void main(String[] args) {
        int arr[][]={
                       {0,1,0},
                       {0,0,0},
                       {0,1,0}
                    };
        System.out.println(matrix(arr));//output should 1
    }
}
