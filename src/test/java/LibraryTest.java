import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;


    @Before
    public void before(){
        library = new Library();
        book = new Book("The Stone", "Fiction", "JK Rowling");
    }

    @Test
    public void libraryHasEmptyBooksList(){
        assertEquals(0, library.bookCount());
    }
    @Test
    public void libraryCanAddBook(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }
    @Test
    public void libraryWontAddIfFull(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.bookCount());
    }

}
