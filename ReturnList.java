package Recursion;

import java.util.ArrayList;

public class ReturnList {
    public static void main(String[] args) {
        int[] arr = {1,3,3,4,5,6};
        System.out.println(findallindex(arr,3,0));

    }
    static ArrayList<Integer> findallindex(int[] arr ,int target ,int index){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }
        //this will contain answer for that function call only
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansfrombelowcalls = findallindex(arr, target ,index+1);

        list.addAll(ansfrombelowcalls);

        return list;
    }
}
