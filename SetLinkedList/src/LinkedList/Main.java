package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(10);
        ll.append(99);
        ll.append(100);
        ll.removeFirst();
        ll.removeTail();
        ll.print();
    }
}