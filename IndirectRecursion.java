package Recursion;

public class IndirectRecursion {
    public static void main(String[] args) {
        int a = 5;
        int ans = fun1(a);
        System.out.println(ans);
    }
    static int fun1(int n){
        if(n == 1){
            return 1;
        }else{
            return n*fun2(n-1);
        }
    }
    static int fun2(int v){
        if(v <= 1){
            return 1;
        }else{
            return v*fun1(v-1);
        }
    }
}
