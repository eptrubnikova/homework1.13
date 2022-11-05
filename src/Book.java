import Author.Author;

import java.util.Objects;

public class Book {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublisher == book.yearPublisher && nameBook.equals(book.nameBook) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author, yearPublisher);
    }

    private final String nameBook;
    private final Author author;
    private int yearPublisher;

    public Book(String nameBook, Author author, int yearPublisher) {
        this.nameBook = nameBook;
        this.author = author;
        this.yearPublisher = yearPublisher;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublisher() {
        return this.yearPublisher;
    }

    public void setYearPublisher(int yearPublisher) {
        this.yearPublisher = yearPublisher;
    }

    public String toString() {
        return this.author + " Название книги: " + this.nameBook +" Год издания: " + this.yearPublisher;
    }
}
