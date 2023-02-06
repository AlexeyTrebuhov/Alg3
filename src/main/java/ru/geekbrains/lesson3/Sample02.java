package ru.geekbrains.lesson3;

public class Sample02 {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.addLast(new Node(11));
        myLinkedList.addLast(new Node(22));
        myLinkedList.addLast(new Node(34));
        myLinkedList.addLast(new Node(42));
        myLinkedList.addLast(new Node(57));

        MyLinkedList.Node head = myLinkedList.getHead();
        System.out.println(" ");

    System.out.println("\n" + "myLinkedList + " + myLinkedList);
    }
}
