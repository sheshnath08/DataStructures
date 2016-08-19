package SortingAlgos;

/**
 * Created by sheshnath on 8/18/2016.
 * This class contains implementation of Quick sort.
 */
public class QuickSort {


    int[] quickSort(int a[],int low, int high){
        if(low<high){
            int q = partition(a,low,high);
            quickSort(a,low,q-1);
            quickSort(a,q+1,high);
        }
        return a;
    }

    int partition(int a[],int low, int high){
        if(low==high)
            return low;
        int q =a[high];
        int i = low-1;
        while(low<high){
            if(a[low]<=q){
                //swap a[i],a[low]
                i = i+1;
                int temp = a[i];
                a[i] = a[low];
                a[low] =temp;
            }
            low++;
        }
        int temp = a[i+1];
        a[i+1] = a[high];
        a[high] = temp;
        return i+1;
    }

    public static void main(String args[]){
        QuickSort q = new QuickSort();
        int a[] = {10,2,1,53,6,8,12,4,17};
        a = q.quickSort(a,0,a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
