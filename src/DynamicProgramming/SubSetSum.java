package DynamicProgramming;

/**
 * Created by sheshnath on 11/23/2016.
 * Question: Give an array of positive integers A and a number K
 * check if there exits a subset of A, whose sum is equals to K
 */
public class SubSetSum {
    public static void main(String args[]){
        int a[] ={3,2,1,5};
        int k = 6;
        System.out.println(isSubSetSum(a,k));
    }
    public static boolean isSubSetSum(int a[],int k){
        boolean dp[][] = new boolean[a.length][k+1];
        for(int i=0;i<a.length;i++){
            dp[i][0] = false;
        }

        for(int i = 0; i<a.length;i++){
            for(int j=1;j<=k;j++){
                if(i==0){
                    if(a[i]==j){
                        dp[i][j] = true;
                    }
                    else {
                        dp[i][j] = false;
                    }
                    continue;
                }
                if(a[i]<j){
                    dp[i][j] = (dp[i-1][j])||(dp[i-1][j-a[i]]);
                }
                else if(a[i]==j){
                    dp[i][j] = true;
                }
                else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[a.length-1][k];
    }
}
