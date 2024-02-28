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


    public LinkedList<Book> searchFor(String searchInput) {
        LinkedList<Book> result = new LinkedList<>();

        for (Book book : bookList) {
            if (book.getAuthor() != null && book.getAuthor().getFirstName().contains(searchInput)) {
                result.add(book);
            } else if (book.getAuthor() != null && book.getAuthor().getLastName().contains(searchInput)) {
                result.add(book);
            } else if (book.getIsbn().contains(searchInput)) {
                result.add(book);
            } else if (book.getTitle().contains(searchInput)) {
                result.add(book);
            }


        }
        return result;
    }

   // public boolean setBorrowed(boolean is);



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