import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Book{
    private String title;
    private String author;
    public Book(String title, String author){
        this.title=title;
        this.author=author;
    }    public String getTitle() {
        return title;    }
    public String getAuthor() {
        return author;    }
}
class Reader{
    private String fullName;
    private String faculty;
    private int birthdate;
    private int phoneNumber;
    public Reader(String fullName,String faculty,
                  int birthdate,int phoneNumber){
        this.fullName=fullName;
        this.faculty=faculty;
        this.birthdate=birthdate;
        this.phoneNumber=phoneNumber;    }
    public void takeBook(int numberOfBooks) {
        System.out.println(fullName + " взял " + numberOfBooks + " книги.");    }
    public void takeBook(String fullName,String bookTitles) {
        System.out.println(fullName + " взял книги: " + bookTitles);    }
    public void takeBook(Book... books) {
        StringBuilder resultBuilder = new StringBuilder();
        for (int i = 0; i < books.length; i++) {
            resultBuilder.append(books[i].getTitle());
            if (i < books.length - 1) {
                resultBuilder.append(", ");
        }        }
        System.out.println(fullName + " взял книги: " + resultBuilder.toString() + ".");
    }
    public void returnBook(int numberOfBooks) {
        System.out.println(fullName + " вернул " + numberOfBooks + " книги.");    }
    public void returnBook(Book... books) {
        StringBuilder resultBuilder = new StringBuilder();
        for (int i = 0; i < books.length; i++) {
        resultBuilder.append(books[i].getTitle());
        if (i < books.length - 1) {
            resultBuilder.append(", ");            }
    }        System.out.println(fullName + " вернул книги: " +
                resultBuilder.toString() + ".");    }}
public class Main{
    public static void main(String [] args){
    Book book1 = new Book ("Huckleberry Finn","Dina");
    Book book2 = new Book ("War and Peace","Olivia");
    Book book3 = new Book ( "Wings "," Rick");
    Reader reader = new Reader("Alibekova Aliman Bekovna",
            "Quality control",100106,0772324323);
    reader.takeBook(book1,book2,book3);
    reader.returnBook(book1,book2,book3);
}
}