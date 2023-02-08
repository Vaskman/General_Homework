package pro.sky.java.objects_and_classes;
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
    public String toString() {
        return "Книга: "+this.bookName+ ", Год Издательства: "+this.publishingYear+" Автор: "+this.author.toString();
    }
}