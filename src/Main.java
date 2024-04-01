import PriorityHeap.MaxHeap;
import PriorityHeap.MinHeap;
import Search.BinarySearch;

public class Main {
    public static void main(String[] args) throws Exception {
        BinarySearch binarySearch = new BinarySearch();
        int[] arr = {1,2,3,4,5,6};
       int result = binarySearch.search(arr,4);
        System.out.println(result);

    }

//    static  int sumOfDigit(int num){
//        if(num<0){
//            return  num;
//        }
//       if(num == 0){
//           return num;
//       }
//       return num%10 + sumOfDigit(num/10);
//    }
//    static int power(int base,int pow){
//        if(pow<0){
//            return pow;
//        }
//        if(pow == 0){
//            return 1;
//        }
//        if(pow ==1){
//            return base;
//        }
//        return base * power(base,pow-1);
//    }
//    static  void largestDivisor(int num,int divisor){
//        if(divisor == num || divisor==1){
//            return;
//        }
//        int m = num/divisor;
//        if(num%divisor == 0 && m%divisor!= 0 ){
//            System.out.println(divisor);
//            return;
//        }
//        largestDivisor(num,divisor+1);
//    }
//    static  int GCD(int a,int b){
//        if(b==0){
//            return a;
//        }
//        return GCD(b,a%b);
//    }
 static   int sum = 0;
    static int reverseNumber(int num){

        if(num == 0){
            return sum;
        }
       sum = sum*10 + num%10;
//        System.out.println(sum);
        reverseNumber(num/10);
        return sum ;
    }
}