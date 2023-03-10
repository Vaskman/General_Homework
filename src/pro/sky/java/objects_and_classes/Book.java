package pro.sky.java.objects_and_classes;

import java.util.Objects;

public class Book {
    private Author author;
    private String bookName;
    private int publishingYear;
    public Book (String bookName,int publishingYear,Author author) {
        this.bookName=bookName;
        this.publishingYear=publishingYear;
        this.author=author;
    }
    public String getBookName() {
        return this.bookName;
    }
    public Author getAuthor() {
        return this.author;
    }
    public int getPublishingYear() {
        return this.publishingYear;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear=publishingYear;
    }
    @Override
    public String toString() {
        return "Книга: "+this.bookName+ ", Год Издательства: "+this.publishingYear+" Автор: "+this.author.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(author, book.author) && Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, bookName, publishingYear);
    }
}