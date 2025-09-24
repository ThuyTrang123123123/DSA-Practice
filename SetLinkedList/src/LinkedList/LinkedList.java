package LinkedList;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data, this.head);
        this.head = newNode;
    }

    public void append(int data) {
        Node newNode = new Node(data, null);
        if (this.head == null) {
            this.head = newNode;
            return;
        }

        Node tail = this.head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = newNode;
    }

    public void removeFirst() {
        if (this.head == null || this.head.next == null) {
            this.head = null;
            return;
        }
        this.head = this.head.next;
    }

    public void removeTail() {
        if (this.head == null || this.head.next == null) {
            this.head = null;
            return;
        }
        Node tail = this.head;
        while (tail.next != null && tail.next.next != null) {
            tail = tail.next;
        }
        tail.next = null;
    }

    public void print() {
        if (this.head == null) {
            return;
        }
        Node tail = this.head;
        while (tail != null) {
            System.out.print(tail.data + " ");
            tail = tail.next;
        }
    }
}
