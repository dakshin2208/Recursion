package Recursion;

public class SumOfNmbers {
    public static void main(String[] args) {
        int a = 5;
        int ans = add (a);
        System.out.println(ans);
    }
    static int add(int s){
        int sum ;
        if(s == 1){
            return s;
        }
         sum = s + add(s-1);
        return sum;
    }


}
