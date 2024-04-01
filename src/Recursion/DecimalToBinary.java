package Recursion;

public class DecimalToBinary {
    public static void main(String[] args) {
        int value = convertToBinary(13);
        System.out.println(value);
    }

    static int convertToBinary(int number){
        if(number == 0){
            return  0;
        }
        int remainder = number%2;

        return remainder + (10 * convertToBinary(number/2));
    }
}
