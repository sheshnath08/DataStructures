package DynamicProgramming;

/**
 * Created by sheshnath on 12/7/2016.
 *
 */
public class JobSchedulingProblem {
    public static void main(String args[]){
        int start_time[] = {1,2,4,6,5,7};
        int end_time[] = {3,5,6,7,8,9};
        int profit[] = {5,6,5,4,11,2};
        System.out.println(find_max_profit(start_time,end_time,profit));
    }
    public static boolean isOverlapping(int i, int j, int start_time[], int end_time[]){
        if(end_time[j]>start_time[i]){
            return true;
        }
        return false;
    }

    public static int find_max_profit(int[] start_time, int[] end_time, int[] profit){
        int[] dp = new int[start_time.length];
        for(int i=0;i<start_time.length;i++){
            dp[i] = profit[i];
        }
        for( int i =1 ;i<start_time.length;i++){
            int j = 0;
            while (j<i){
                if(!isOverlapping(i,j,start_time,end_time)){
                    dp[i] = Math.max(dp[i],dp[j]+profit[i]);
                }
                j++;
            }
        }
        int max = dp[0];
        for(int i = 1;i<start_time.length;i++){
            if (dp[i]>max){
                max = dp[i];
            }
        }
        return max;
    }
}

