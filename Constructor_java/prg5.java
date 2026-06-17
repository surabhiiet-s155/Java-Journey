public class Book {

    String title;
    String author;

    Book(String t, String a) {

        title = t;
        author = a;

    }

    void display() {

        System.out.println(title);
        System.out.println(author);

    }

    public static void main(String[] args) {

        Book b =
          new Book("Java Basics", "Surabhi");

        b.display();

    }
}
