package Recursion;

public class Bs {
    public static void main(String[] args) {
        int[] arr = {20,30,40,50,66,77,99};
        int target = 50;
        int ans = search(arr , target , 0 , arr.length-1);
        System.out.println(ans);

    }
    static int search(int[] arr , int target , int s , int e ){
        if(s > e) {
            return -1;
        }
        int m = s + (e - s)/2;

        if(arr[m] == target){
            return m;
        }
        if(arr[m] > target){
            return search(arr , target , m+1 ,e);
        }else{
            return search(arr ,target , m-1, e);
        }

    }
}
