package exercises.library;

public class Book {
    private String title;
    private String isbn;
    private Author author;


    public Book () {

    }

    public Book (String title, String isbn, Author author) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }






    //getter & setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

}
