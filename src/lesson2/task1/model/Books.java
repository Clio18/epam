package lesson2.task1.model;
import lesson2.task1.comparator.BookPublisherComparator;
import lesson2.task1.model.entity.Book;
import java.util.Arrays;

public class Books {
    private Book[] books;

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Book [] getByAuthor(String author){
        Book [] temp = new Book[books.length];
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if(books[i].getAuthor().equals(author)){
                temp[count++] = books[i];
            }
        }
        return Arrays.copyOf(temp, count);
    }
    public Book [] getByPublisher(String publisher){
        Book [] temp = new Book[books.length];
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if(books[i].getPublisher().equals(publisher)){
                temp[count++] = books[i];
            }
        }
        return Arrays.copyOf(temp, count);
    }
    public Book [] getBooksFromYear(int year){
        Book [] temp = new Book[books.length];
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if(books[i].getYear()>=year){
                temp[count++] = books[i];
            }
        }
        return Arrays.copyOf(temp, count);
    }

}
