package PriorityHeap;

import java.util.ArrayList;
import java.util.List;

public class MinHeap<T extends Comparable<T>> {
    public final ArrayList<T> list;
    public MinHeap(){
        list = new ArrayList<>();
    }
    private void swap(int firstIndex,int secondIndex){
        T temp = list.get(firstIndex);
        list.set(firstIndex,list.get(secondIndex));
        list.set(secondIndex,temp);
    }
    private int parent(int index){
        return (index-1)/2;
    }
    private int left(int index){
        return 2*index + 1;
    }
    private int right(int index){
        return 2*index + 2;
    }

    public void insert(T value){
        list.add(value);
        upHeap(list.size()-1);
    }
    private void upHeap(int index){
        if(index == 0){
            return;
        }
        int parentIndex = parent(index);
        if(list.get(index).compareTo(list.get(parentIndex))<0){
            swap(index,parentIndex);
            upHeap(parentIndex);
        }
    }
    public T remove() throws Exception{
        if(list.isEmpty()){
            throw  new RuntimeException("list is empty");
        }
        T temp = list.get(0);
        T last = list.remove(list.size()-1);
        if(!list.isEmpty()){
            list.set(0,last);
            downHeap(0);
        }
        return temp;
    }
    private void downHeap(int index){
        int min = index;
        int left = left(index);
        int right = right(index);
        if(left < list.size() && list.get(left).compareTo(list.get(min))<0){
            min = left;
            System.out.println("min " + min);
        }
        if(right < list.size() && list.get(right).compareTo(list.get(min))<0){
            min = right;
            System.out.println("min 2 " + min);
        }
        if(min != index){
            swap(min,index);
            downHeap(min);
        }
    }
    public List<T> heapSort() throws Exception {
        List<T> sortedList = new ArrayList<>();
        while (!list.isEmpty()){
            sortedList.add(remove());
        }
        return sortedList;
    }
}
