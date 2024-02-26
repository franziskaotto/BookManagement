package exercises.library;

import java.util.LinkedList;

public class Author {
    private String firstName;
    private String lastName;
    LinkedList<Book> authorBookList;



    public Author () {

    }

    public void addBookToAuthor(Book book){
        authorBookList.add(book);
    }







    //getter & setter
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public LinkedList<Book> getAuthorBookList() {
        return authorBookList;
    }

    public void setAuthorBookList(LinkedList<Book> authorBookList) {
        this.authorBookList = authorBookList;
    }
}
