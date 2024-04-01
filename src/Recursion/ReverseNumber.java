package Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        int result = reverseNum(694801);
        System.out.println(result);
    }
    static  int reversed = 0;
    static  int reverseNum(int num){

        if(num == 0){
            return  reversed;
        }
        reversed = reversed*10 +num%10;

        return  reverseNum(num/10);
    }
}
