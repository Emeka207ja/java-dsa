package PriorityHeap;

import java.util.ArrayList;
import java.util.List;

public class MaxHeap<T extends  Comparable<T>> {
    public List<T> list;
    public MaxHeap(){
        list = new ArrayList<>();
    }
    public void insert(T value){
        list.add(value);
        upHeap(list.size()-1);
    }
    private void swap(int firstIndex,int secondIndex){
        T temp = list.get(firstIndex);
        list.set(firstIndex,list.get(secondIndex));
        list.set(secondIndex, temp);
    }
    private void upHeap(int index){
        if(index== 0){
            return;
        }
        int parenIndex = parent(index);
        if(index<list.size() && list.get(index).compareTo(list.get(parenIndex))>0){
            swap(index,parenIndex);
            upHeap(parenIndex);
        }
    }
    private void  downHeap(int index){
        int max = index;
        int leftIndex = left(index);
        int rightIndex = right(index);
        if(leftIndex<list.size() && list.get(max).compareTo(list.get(leftIndex))<0){
            max = leftIndex;
            System.out.println("max " + max);
        }
        if (rightIndex<list.size() &&list.get(max).compareTo(list.get(rightIndex))<0){
            max = rightIndex;
            System.out.println("max2 " + max);
        }
        if(max != index){
            for (T t: list){
                System.out.println(t);
            }
            swap(max,index);
            downHeap(max);
        }
    }
    public T remove(){
        T temp = list.get(0);
        T lastItem = list.remove(list.size()-1);
        if(!list.isEmpty()){
            list.set(0,lastItem);
            downHeap(0);
        }
        return  temp;
    }
    private int parent(int index){
        return (index-1)/2;
    }
    private int left(int index){
        return  2*index+1;
    }
    private int right(int index){
        return 2*index+2;
    }
}
