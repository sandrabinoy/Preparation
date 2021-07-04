package week1.day6;

public class Main {

    public static void main(String[] args) {

        SinglyLinkedList<Book> linkedList = new SinglyLinkedList<>();

        Book book1 = new Book("A Brief History Of Time", "Stephen Hawking", 1);
        Book book2 = new Book("Never Cry Wolf", "Farley Mowat", 2);
        Book book3 = new Book("The Beauty Myth", "Naomi Wolf", 3);
        Book book4 = new Book("Einstein's unfinished Revolution", "Lee Smolin", 4);
        Book book5 = new Book("Catching Stardust", "Natalie Starkey", 5);

        linkedList.add(book1);
        linkedList.add(book2);
        linkedList.add(book3);
        linkedList.add(book4);
        linkedList.add(book5);

        linkedList.displayList();

    }

}
