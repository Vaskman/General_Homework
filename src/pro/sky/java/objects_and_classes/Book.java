package pro.sky.java.objects_and_classes;
public class Book {
    private String authorName;
    private String bookName;
    private int publishingYear;
    public Book (String authorName,String bookName,int publishingYear) {
        this.authorName=authorName;
        this.bookName=bookName;
        this.publishingYear=publishingYear;
    }
    public String getBookName() {
        return this.bookName;
    }
    public String getAuthorName() {
        return this.authorName;
    }
    public int getPublishingYear() {
        return this.publishingYear;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear=publishingYear;
    }
}