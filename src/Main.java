import LinkedList.SinglyLinkedList;
import PriorityHeap.MaxHeap;
import PriorityHeap.MinHeap;
import Search.BinarySearch;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertFirst(5);
        singlyLinkedList.insertFirst(6);
        singlyLinkedList.insertFirst(7);
        singlyLinkedList.insertLast(10);
        singlyLinkedList.insertIndex(3,9);
        System.out.println(singlyLinkedList.deleteByIndex(2));
        List<Integer> result = singlyLinkedList.display();
        System.out.println(result);
        System.out.println("head " + singlyLinkedList.getHead());
        System.out.println("tail " + singlyLinkedList.getTail());




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