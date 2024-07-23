package Recursion;

public class palindrom {
    static int sum = 0;
    static void rev1(int n){
        if(n==0){
            return ;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev1(n/10);
    }

    static boolean palin(int n){
        return n== sum;
    }
    public static void main(String[] args) {
        System.out.println(palin(123));
    }
}
