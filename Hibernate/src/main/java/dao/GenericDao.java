package dao;

import entitities.BasicEntity;

import java.io.Serializable;
import java.util.List;

/**
 * Created Class by Bajky on 16.10.2015.
 */
public interface GenericDao<T extends BasicEntity> extends Serializable {

    T findById(long id);

    void create(T entity);

    void updateObject(T object);

    void deleteObject(T object);

    List<T> findAll();

    void dropAll();


}