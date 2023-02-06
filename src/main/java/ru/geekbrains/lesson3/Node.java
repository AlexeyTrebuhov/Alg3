package ru.geekbrains.lesson3;

public class Node {


        private int value; // переменная
        public Node next;// следующее значчеие

        public int getValue () {
            return value;
        }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }

    public void setValue (int value){
            this.value = value;
        }

    public Node getNext () {
            return next;
        }

        public void setNext (Node next){
            this.next = next;
        }

    public Node( int value){
            this.value = value;
        }
    }
