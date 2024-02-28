package exercises.library;

import com.sun.jdi.connect.spi.TransportService;

import java.util.LinkedList;

/**
 * Erstelle ein Buchverwaltungssystem.
 * Das Buchverwaltungssystem soll eine Liste von Bücher halten, des Weiteren soll
 * nach Büchern anhand derer Titel oder ISBN oder dem Vor- und Nachnamen des Autors gesucht werden können.
 * Bücher sollen ausgeliehen und zurückgegeben werden können, sind die Bücher ausgeliehen so darf das Buch
 * kein weiteres mal ausgeliehen werden.
 *
 * Ein Buch hat unter anderen(!) folgende Attribute (Titel, ISBN, Autor-Objekt)
 * Ein Autor besteht aus folgenden Attributen (Vorname, Nachname, Liste von Büchern)
 *
 *
 * Erstellen Sie mindestens 5 Bücher, mindestens 2 Bücher sollen denselben Autor haben. Suchen Sie nach mindestens
 * 2 Büchern, leihen Sie mindestens 2 Bücher aus, versuchen Sie ein ausgeliehenes Buch auszuleihen und geben Sie diese
 * auch wieder zurück.
 *
 */
public class Main {
    public static void main(String[] args){
        BookManagement bookMngm = new BookManagement();




        //erstellt 3 Authoren
        Author michael = new Author();
        michael.setFirstName("Michael");
        michael.setLastName("Ende");


        Author cornelia = new Author();
        cornelia.setFirstName("Cornelia");
        cornelia.setLastName("Funke");

        Author karl = new Author();
        karl.setFirstName("Karl");
        karl.setLastName("May");

        //erstellt 5 Bücher
        Book momo = new Book();
        momo.setTitle("Momo");
        momo.setAuthor(michael);
        momo.setIsbn("MOMO123456");

        Book silbersee = new Book();
        silbersee.setTitle("Der Schatz im Silbersee");
        silbersee.setAuthor(karl);
        silbersee.setIsbn("SILBER987");

        Book winnetou = new Book();
        winnetou.setTitle("Winnetou I");
        winnetou.setAuthor(karl);
        winnetou.setIsbn("WINNE5555555");

        Book tintenherz = new Book();
        tintenherz.setTitle("Tintenherz");
        tintenherz.setAuthor(cornelia);
        tintenherz.setIsbn("TINTE4563215");

        Book diebe = new Book();
        diebe.setTitle("Der Herr der Diebe");
        diebe.setAuthor(cornelia);
        diebe.setIsbn("DIEBE23232323");

        //adds the books to the authorList. ich habe die methode auf jeden author gecallt, nachdem alle bücher erstellt wurden
        //dann übergebe ich ihm die Bücher die dazugehören

        michael.addBookToAuthor(momo);
        karl.addBookToAuthor(silbersee);
        karl.addBookToAuthor(winnetou);
        cornelia.addBookToAuthor(tintenherz);
        cornelia.addBookToAuthor(diebe);


        bookMngm.addNewBook(momo);
        bookMngm.addNewBook(silbersee);
        bookMngm.addNewBook(winnetou);
        bookMngm.addNewBook(tintenherz);
        bookMngm.addNewBook(diebe);

        bookMngm.addNewAuthor(michael);
        bookMngm.addNewAuthor(karl);
        bookMngm.addNewAuthor(cornelia);

        bookMngm.printBothLists();

        String searchInput = "Karl";


        LinkedList<Book> searchResult = bookMngm.searchFor(searchInput);


        for (Book book : searchResult) {
            System.out.println("searchResult " + book.getTitle());
        }

















    }



}
