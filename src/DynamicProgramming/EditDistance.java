package DynamicProgramming;

/**
 * Created by sheshnath on 11/25/2016.
 */
public class EditDistance {
    public static void main(String args[]){
        System.out.println(editDistance("abe","abc"));
    }
    public static int editDistance(String str1, String str2){
        int m = str1.length();
        int n = str2.length();
        int dp[][] = new int[n+1][m+1];
        for(int i =0; i<=n;i++){
            for(int j = 0;j<=m;j++){
                if(i==0){
                    dp[i][j] = j;
                }
                if(j==0){
                    dp[i][j] = i;
                }
            }
        }
        for(int i =1; i<=n;i++){
            for(int j = 1;j<=m;j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }
                else{
                    dp[i][j] = 1+min(dp[i-1][j-1],dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        return dp[n][m];
    }
    public static int min(int a,int b, int c){
        if(a<b && a<c){
            return a;
        }
        if(b<a && b<c){
            return b;
        }
        return c;
    }
}

