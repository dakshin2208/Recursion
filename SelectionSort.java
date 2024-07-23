package Recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        selection(arr, arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr, int r,int c ,int max){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[max]){
                //this checks entire arr on by one and get max value in array
                selection(arr, r,c+1,c);
            }else{
                //if the first element in array is greater in array means this will execute
                selection(arr, r ,c+1,max);
            }
        }else{
            //one the array is completely checked and found the greatest among them
            //just swap at the last means arr.length-1
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            //here  just reduces the arr length
            selection(arr,r-1,0,0);
        }
    }       //pretty cool...lol
}
