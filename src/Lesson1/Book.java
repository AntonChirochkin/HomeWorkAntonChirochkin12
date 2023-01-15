package Lesson1;

import java.util.Objects;

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
        if (publishingYear < this.publishingYear) {
            throw new IllegalArgumentException("Новая дата издания ранее старой даты издания");
        }
        if (publishingYear < 0) {
            throw new IllegalArgumentException("Год не может быть отрицательным");
        }
        this.publishingYear = publishingYear;
    }
    public String getFullName() {
        return author.getName() + " " + author.getSurname();
    }
    public String FullName() {
        return author.getName() + " " + author.getSurname();
    }

    public String toString() {
        return "Произведение " + this.bookName + ", автор " + FullName() + ", год издания - " + this.publishingYear;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getPublishingYear() == book.getPublishingYear() && getBookName().equals(book.getBookName()) && getAuthor().equals(book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getAuthor(), getPublishingYear());
    }
}