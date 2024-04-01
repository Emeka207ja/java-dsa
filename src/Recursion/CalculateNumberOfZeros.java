package Recursion;

public class CalculateNumberOfZeros {
    public static void main(String[] args) {
        int result = numberOfZeros(306000, 0);
        System.out.println(result);

    }
    static  int numberOfZeros(int num,int count){
        if(num == 0){
            return  count;
        }
        int remainder = num%10;
        if(remainder == 0){
            return  numberOfZeros(num/10,count+1);
        }
        return numberOfZeros(num/10,count);
    }
}
