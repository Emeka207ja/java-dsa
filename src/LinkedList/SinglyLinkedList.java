package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class SinglyLinkedList {
    Node head;
    Node tail;
    int size;
    public SinglyLinkedList(){
        this.size=0;
    }
    public void insertFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if(tail== null){
            tail= head;
        }
        size+=1;
    }
    public  void insertLast(int value){
        Node newNode = new Node(value);
        tail.next = newNode;
        newNode.next= null;
        tail= newNode;
        if(head == null){
            head = tail;
        }
        size+=1;
    }
    public List<Integer>display(){
        List<Integer> list = new ArrayList<>();
        Node temp = head;
        while(temp!= null){
            list.add(temp.value);
            temp = temp.next;
        }
        return  list;
    }
    public void insertIndex(int index,int value){
        Node temp = head;
        if(index== 0){
            insertFirst(value);
            return;
        } else if (index>size) {
            throw new IndexOutOfBoundsException();
        } else if (index== size) {
            insertLast(value);
            return;
        }else {
            for (int i = 1;i<index;i++){
                temp = temp.next;
            }
            Node newNode = new Node(value,temp.next);
            temp.next= newNode;
        }
    }
    public  Object getAtIndex(int index){
        Node temp = head;
        if(temp == null){
            return null;
        } else if (index>size) {
            throw new IndexOutOfBoundsException("index out of bound");
        } else if (index ==0){
            return  getFirst();
        } else if (index == size) {
            return  getLast();
        }else {
            for (int i = 1;i<index;i++){
                temp = temp.next;
            }
            return (int) temp.next.value;
        }

    }
    public  Object deleteByIndex(int index){
        if(index>size){
            throw  new IndexOutOfBoundsException("index out of bound");
        }else if(head== null || tail== null){
            return null;
        }else if(index==0){
            return deleteFirst();
        } else if (index == size) {
            return deleteLast();
        }else {
            Node temp = head;
            Object val = getAtIndex(index);
            for (int i = 1;i<index;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            return val;
        }

    }

    private Object deleteFirst(){
        Node temp = head;
        if(head== null){
            return null;
        }
        head = head.next;
        temp.next= null;
        size--;
        return  (int)temp.value;
    }
    private Object deleteLast(){
        Node temp = head;
        if (tail == null){
            return  null;
        }
        for (int i=1;i<=size-1; i++){
            temp = temp.next;
        }
        System.out.println("second to last -> " + temp.value);
        tail = temp;
        temp = temp.next;
        tail.next = null;
        return temp.value;


    }

    private  Object getFirst(){
        if (head == null){
            return null;
        }
        return (int) head.value;
    }
    private  Object getLast(){
        if (tail == null){
            return null;
        }
        return (int) tail.value;
    }


    public int getTail() {
        return tail.value;
    }

    public int getHead() {
        return head.value;
    }

    public int getSize() {
        return size;
    }

    private static class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
