package Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,2,1,18,9,9};
        System.out.println(find(arr,3,0));
        System.out.println(findindex(arr,18,0));
        System.out.println(findindexlast(arr,8,arr.length-1));
//        FindAllIndex(arr ,9,0);
//        System.out.println(list);

        System.out.println(FindAllIndex(arr,9,0,new ArrayList<>()));
    }
    static boolean find (int[] arr , int target , int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr,target, index+1);
    }
    static int findindex (int[] arr , int target , int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return findindex(arr , target, index +1);
        }
    }
    static int findindexlast(int[] arr ,int target ,int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return findindexlast(arr, target,index-1);
    }
//    static ArrayList<Integer> list = new ArrayList<>();
//    static void FindAllIndex(int[] arr , int target, int index){
//        if(index == arr.length){
//            return ;
//        }
//        if(arr[index] == target){
//            list.add(index);
//        }
//         FindAllIndex(arr, target , index+1);
//    }
    static ArrayList<Integer> FindAllIndex(int[] arr , int target, int index,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return FindAllIndex(arr, target , index+1 , list);
    }
}
