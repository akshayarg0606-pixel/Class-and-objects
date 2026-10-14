
import java.util.ArrayList;
class Book{
    String title;
    String author;
    int ISBN;
    static ArrayList<Book> books=new ArrayList<>();
    Book(String title,String author, int ISBN){
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;


    }

    static void addbook(Book book)
    {
        books.add(book);
        System.out.println(book.title); 
        
    }
    static void removebook(Book book){
        books.remove(book);
        System.out.println(book.title);
    }
 public static void main(String[] args) {
        Book b1=new Book("java","aa",103);
        Book b2=new Book("c","bb",104);
        addbook(b1);
        addbook(b2);
        removebook(b1);
       
    }
}