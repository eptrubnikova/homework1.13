import Author.Author;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Про Git", new Author("Бен", "Штрауб"), 2014);
        //System.out.println("name.book = " + book1.getNameBook());
        //System.out.println("book.yearPublisher = " + book1.getYearPublisher());
        // book1.setYearPublisher(2018);
        //System.out.println("book1.getYearPublisher() = " + book1.getYearPublisher());
        //System.out.println("book.authorName = " + book1.getAuthor() );

        System.out.print(book1);
        System.out.println();

        Book book2 = new Book("Про Git", new Author("Бен", "Штрауб"), 2014);
        // System.out.println("name.book = " + book2.getNameBook());
        //System.out.println("book.yearPublisher = " + book2.getYearPublisher());
        //System.out.println("book.authorName = " + book2.getAuthor() );
        System.out.print(book2);
        System.out.println();

        Book book3 = new Book("Про Git", new Author("Том", "Штрауб"), 2014);
        System.out.print(book3);
        System.out.println();

        System.out.println(book1.equals(book2));
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());

        System.out.println(book1.equals(book3));
        System.out.println(book1.hashCode());
        System.out.println(book3.hashCode());

    }

}
