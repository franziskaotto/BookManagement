package exercises.library;

import java.util.LinkedList;

public class BookManagement {
    private LinkedList<Book> bookList;
    private LinkedList<Author> authorList;


    public BookManagement(){
        this.bookList = new LinkedList<>();
        this.authorList = new LinkedList<>();

    }

    public void addNewBook(Book book){
        bookList.add(book);
    }

    public void addNewAuthor(Author author){
        authorList.add(author);
    }



    public void printBothLists(){
        for (Book book : bookList) {
            System.out.println("book: " + book.getTitle());
        }

        for (Author author : authorList) {
            System.out.println(author.getFirstName());
        }
    }







    //getters and setters
    public LinkedList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(LinkedList<Book> bookList) {
        this.bookList = bookList;
    }

    public LinkedList<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(LinkedList<Author> authorList) {
        this.authorList = authorList;
    }
}
