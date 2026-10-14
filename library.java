


import java.util.ArrayList;
class library{
     String bookk;
     public library(String bookk){
        this.bookk=bookk;
     }

    static ArrayList<library> books=new ArrayList<>();

    static void addbooks(library book){
        books.add(book);
        System.out.println(book.bookk);
    }
    static void removebooks(library book){
        books.remove(book);
        System.err.println(book.bookk);
    }

    public static void main(String[] args) {
        library l1=new library("JAVA");
        library l2=new library("C++");
        addbooks(l1);
        removebooks(l2);
    }
}