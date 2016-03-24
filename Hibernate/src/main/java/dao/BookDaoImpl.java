package dao;

import entitities.Book;

import javax.ejb.Stateful;

/**
 * Created by David on 24. 3. 2016.
 */
@Stateful
public class BookDaoImpl extends GenericDaoImpl<Book> implements BookDao{
}
