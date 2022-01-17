package com.bridgelabz;

public class UC1LinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertingFirst(70);
        linkedList.insertingFirst(40);
        linkedList.insertingFirst(56);
        linkedList.insertingFirst(30);
        linkedList.insertingFirst(89);
        linkedList.insertingFirst(52);
        linkedList.showList();
    }
}
class Node {
    int data;
    Node next;
    //initilizing the parameters
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    Node head;
    Node tail;
    Node temp;

    //Inserting the First Node
    public void insertingFirst(int data){
        Node newNode = new Node(data);
        // if Head is Empty
        if(head == null){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    //Displaying the Linked List
    public void showList(){
        if(head == null){
            System.out.println("Linked List is Empty");
        } else {

            temp = head;
            while ( temp != null){
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
        }
    }
}