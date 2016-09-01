package SortingAlgos;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by sheshnath on 8/18/2016.
 * This class contains code to implement heap sort by using max-heap data Structure
 */
public class HeapSort {
   public static void main(String args[]){
       MaxHeap h = new MaxHeap(5);
       h.insert(10);
       h.insert(9);
       h.display();
       h.insert(3);
       h.display();
       h.delete(9);
       h.display();
       h.delete(3);
       h.display();
       h.insert(5);
       h.insert(2);
       h.display();
     /*  ArrayList<Integer> a = new ArrayList<>();
       a.add(90);
       a.add(58);
       a.add(69);
       a.add(70);
       a.add(82);
       a.add(100);
       a.add(13);
       a.add(57);
       a.add(47);
       a.add(18);
       System.out.println(h.largestRectangleArea(a));*/
   }
}

class MaxHeap{
    int arr[];
    int size;
    public MaxHeap(int n){
        arr = new int[n+1];
        size = 0;
        arr[0] = Integer.MIN_VALUE;
    }

    public int getLeft(int i){
        return 2*i;
    }
    public int getRight(int i){
        return (2*i)+1;
    }

    public boolean isLeaf(int i){
        if(i>size/2){
            return true;
        }
        return false;
    }

    public int getParent(int i){
        return i/2;
    }

    public void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void insert(int data){
        arr[++size] = data;
        int current = size;
        while(arr[getParent(current)]>arr[current]){
            swap(getParent(current),current);
            current = getParent(current);
        }
    }

    public void delete(int n){
        int i=0;
        for(i = 1;i<=size;i++){
            if(arr[i] == n){
                break;
            }
        }
        if(i<=size){
            arr[i] = arr[size];
            size--;
            heapify(i);
        }
    }

    public void heapify(int i){
        int l = getLeft(i);
        int r = getRight(i);
        int max = 0;
        if(l<size && arr[l]<arr[i]){
            max = l;
        }
        else{
            max = i;
        }
        if(r<size && arr[r]<arr[max]){
            max = r;
        }

        if(max != i){
            swap(i,max);
            heapify(max);
        }
    }

    public void display(){
        System.out.println(arr[1]);
    }
}