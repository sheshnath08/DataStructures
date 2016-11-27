package DynamicProgramming;

/**
 * Created by sheshnath on 11/23/2016.
 */
public class CoinChange {
    public static void main(String args[]){
        int a[]={2,5,10};
        System.out.println(coinChange(a,13));

    }
    public static int coinChange(int coins[],int amount){
        int res[] = new int[1];
        int T[] = new int[amount+1];
        for(int i=0;i<T.length;i++){
            T[i] = Integer.MAX_VALUE-1;
        }
        T[0] = 0;
        for(int i=0;i<coins.length;i++){
            for(int j =0;j<=amount; j++){
                if(j>=coins[i]){
                    T[j] = Math.min(T[j],1+T[j-coins[i]]);
                }
            }
        }
        if(T[amount] == Integer.MAX_VALUE-1){
            return -1;
        }
        return T[amount];
    }

}

