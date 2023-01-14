package Lesson1;

public class Book {
   private String bookName;
    private Author author;
    private int publishingYear;


    public Book(String bookName, Author author, int publishingYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishingYear = publishingYear;
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
      this.publishingYear = publishingYear;
    }
    public String getFullName() {
        return author.getName() + " " + author.getSurname();
    }
}