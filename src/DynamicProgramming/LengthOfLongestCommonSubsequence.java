package DynamicProgramming;

/**
 * Created by sheshnath on 11/21/2016.
 */
public class LengthOfLongestCommonSubsequence {
    public static void main(String args[]){
        System.out.println(longestCommonSubsequence("abcdf","xyz"));
    }

    public static int longestCommonSubsequence(String input1, String input2){
        int ans = 0;
        int n = input1.length();
        int m = input2.length();
        int dp[][] = new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            dp[i][0] = 0;
        }
        for( int i = 0; i <= m; i++ ){
            dp[0][i] = 0;
        }
        for( int i = 1; i <= n; i++ ){
            for( int j = 1; j <= m; j++ ){
                if(input1.charAt(i-1)==input2.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][m];
    }
}
