package Recursion;

public class sumofdigtis {
    public static void main(String[] args) {
        int ans = prod(1342);
        System.out.println(ans);
    }
    static int sod(int n){
        if(n == 0){
            return 0;
        }
        return  n%10 + sod(n/10) ;
    }
    static int prod(int n){
        if(n%10 == n){
            return n;
        }
        return  n%10 * prod(n/10) ;
    }
}
