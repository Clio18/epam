package lesson4.src.main.java.lesson2.task1.model.entity;

public class Book {
    private String name;
    private String author;
    private String publisher;
    private int year;
    private int pages;
    private double price;

    public Book() {
    }

    public Book(String name, String author, String publisher, int year, int pages, double price) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book " +
                "name is " + name +
                ", author is " + author +
                ", publisher is " + publisher +
                ", year is " + year +
                ", pages are " + pages +
                ", price is " + price;
    }

}
