package Recursion;

public class UnderstandRecursion {
    public static void main(String[] args) {
        int n = 3;
        print (n);

    }
    static void print(int n){

        if(n < 1){
            return;
        }
        System.out.print(n);
        print(n-1);
        System.out.print(n);
    }

}
