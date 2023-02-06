package ru.geekbrains.lesson3;

public class MyLinkedList extends  Sample02{

    public static class Node{
        Node next;
        public Node(ru.geekbrains.lesson3.Node value) {

        }

        public void next(Node node) {
        }
    }

    private Node head; // Ссылка на первый элемент связного списка
    private Node tail; // Ссылка на последний элемент связного списка

    public Node getHead() {
        return head;
    }



    public void addLast(ru.geekbrains.lesson3.Node value){  // метод добавляет элемент в конец списка
        Node node = new Node(value);
        if (head == null){  // частный случай 2. Добавили элемент к пустому списку
            head = node;
        }
        else {              // частный случай 2. Добавили элемент к непустому списку
            Node last = head;
            while (last.next != null){
                last = last.next; // дошли до конца списка
            }
            last.next(node);  // добавили node как последний элемент списка
        }
    }




    public  void overkill () { // метод разворота односвязного списка

        if (head == null)   // частный случай 1. Если список пустой, все сразу завершилось
            return;

        Node node = head; // присваиваем переменной node значение head ( начало)

        if (node.next.next == null)   // частный случай 2. Если список из одного элемента, все сразу завершилось
            return;

        // частный случай 3. Если список больше одного элемента
        tail = head; // назначаем конец списка ( бывший первый элемент)

        Node temp = head.next; // создали переменную и присвоили ей значение следующего элемента
        // в данном случаее, второго и держим значение в памяти
        head.next = null;         // старый первый элемент списка должен стать последним. Поэтому
        // ссылку на нем меняем на null ( так как после последнего элемента ничего нет)

        // теперь у нас последний элемент стал первым, но пока не имеет ссылок на следующий
        // первый элемнт стал последним и имеет ссылку на null. но на него самого ссылок пока нет


        while (temp != null){   // идем вдоль списка с помощью переменной пока последний элемент не даст null

            Node next = temp.next;  // сохраняем ссылку на следующий элемент ( третий)
            temp.next = head; // назначаем текущую ссылку на следующий элемент как head.

            head = temp;  // смещаем на один элемент ссылки
            temp = next;
        }
    }
}
