package week1.day6;

public class SinglyLinkedList<Item> {

    private Node<Item> head;
    private int size = 0;

    public void add(Item data) {
        Node<Item> node = new Node<>(data);
        //The new node should be pointing to whatever head is pointing at. Head has no data, only the reference to the next node.
        node.setNext(head);
        head = node;
        size++;
    }

    public boolean isEmpty () {
        return head == null;
    }

    public int getSize () {
        return size;
    }

    public Node remove () {
        if (isEmpty()) {
            return null;
        }

        Node<Item> removedNode = head;
        head = head.getNext();
        size--;
        return removedNode;
    }

    public void displayList() {

        Node node = this.head;
        System.out.println("\tNumber" +
                "\t\tTitle" +
                "\t\t\t\t\t\t\tAuthor");

        for(int i = 0; i < size; i++) {

            System.out.println(node.getData());
            node = node.getNext();

        }

    }

}

class SinglyLinkedListArrays <Item> {

    private Item[] linkedList;
    private int size = 0;
    private int capacity = 0;

    public SinglyLinkedListArrays () {
        capacity = 10;
        // Object[]() -> Incorrect
        linkedList = (Item[]) new Object[capacity];
    }

    public void add (Item data) {
        if(size == capacity) {
            resize (true);
        }
        linkedList[size++] = data;
    }

    public int getSize () {
        return size;
    }

    public boolean isEmpty () {
        return size == 0;
    }

    public Item remove () {
        // Missed the last parenthesis in the if statement
        if(capacity < (capacity/4)) {
            resize (false);
        }
        Item removedItem = linkedList[size--];
        return removedItem;
    }

    public void resize (boolean increaseCapacity) {
        if (increaseCapacity) {
            capacity *= 2;
        }
        else {
            capacity /= 4;
        }
        Item[] newLinkedList = (Item[]) new Object[capacity];
        for(int i = 0; i < size; i++) {
            newLinkedList[i] = linkedList[i];
        }
        linkedList = newLinkedList;
    }

}