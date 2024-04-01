import PriorityHeap.MaxHeap;
import PriorityHeap.MinHeap;

public class Main {
    public static void main(String[] args) throws Exception {
        MaxHeap<Integer> maxHeap = new MaxHeap<>();
        maxHeap.insert(13);
        maxHeap.insert(12);
        maxHeap.insert(10);
        maxHeap.insert(9);
        maxHeap.insert(3);
        maxHeap.remove();

        System.out.println(maxHeap.list);

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