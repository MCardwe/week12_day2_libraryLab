import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("The Stone","JK Rowling" ,"Fiction");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("The Stone", book.getTitle());
    }
    @Test
    public void bookHasAuthor(){
        assertEquals("JK Rowling", book.getAuthor());
    }
    @Test
    public void bookHasGenre(){
        assertEquals("Fiction", book.getGenre());
    }
}
