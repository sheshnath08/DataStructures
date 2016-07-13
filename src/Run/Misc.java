package Run;

/**
 * Created by sheshnath on 7/13/2016.
 */
public class Misc {

    public Misc(){

    }
    //Finding min in Circularly sorted array
   public int findMin(int a[]){
        int low = 0;
        int high = a.length-1;
        int m = 0;
        while(low<=high){
            m= (low+high)/2;
            if(a[m] <a[high]){
                high = m-1;
            }
            else
            {
                low = m+1;
            }
        }
        return a[m];
    }
}
