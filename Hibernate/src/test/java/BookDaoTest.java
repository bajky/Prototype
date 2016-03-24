import dao.BookDaoImpl;
import entitities.Book;
import org.junit.Test;

import javax.inject.Inject;

/**
 * Created by David on 24. 3. 2016.
 */
public class BookDaoTest {

    @Inject
    private BookDaoImpl bookDao;

    @Test
    public void bookTest() throws Exception {
        Book book = new Book();
        book.setAuthorName("david");
        book.setTitle("tittle");
        book.setYear(100);

        bookDao.findAll();
    }
}
