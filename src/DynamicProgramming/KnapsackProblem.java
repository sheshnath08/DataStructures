package DynamicProgramming;

/**
 * Created by sheshnath on 11/21/2016.
 * 0/1Knapsack Problem
 */
public class KnapsackProblem {
    public static void main(String args[]){
        int wt[]={1,3,4};
        int val[]={3,5,6};
        int totalWt = 5;
        System.out.println(knapsack(wt,val,totalWt));
    }

    public static int knapsack(int[] wt,int val[],int totalWt){
        int ans=0;
        int n = wt.length;
        int dp[][]=new int[n+1][totalWt+1];
        for(int i=0;i<=n;i++){
            dp[i][0] = 0;
        }
        for(int i=0; i<=totalWt;i++){
            dp[0][i] = 0;
        }
        for(int i=1;i<=n;i++){
            for(int j = 1;j<=totalWt;j++){
                if(wt[i-1]<=j){
                    dp[i][j] = Math.max(dp[i-1][j],val[i-1]+dp[i-1][j-wt[i-1]]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][totalWt];
    }
}
