package dao;

import entitities.BasicEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created Class by Bajky on 16.10.2015.
 */
public class GenericDaoImpl<T extends BasicEntity> implements GenericDao<T> {

    private final Class thisClass;
    private EntityManager entityManager;
    
    public GenericDaoImpl() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        thisClass = (Class) pt.getActualTypeArguments()[0];
    }

    @Override
    public T findById(long id) {
        return (T) entityManager.find(thisClass, id);
    }

    @Override
    public void create(T entity) {
        entityManager.persist(entity);
    }

    @Override
    public void updateObject(T entity) {
        entityManager.merge(entity);
    }

    @Override
    public void deleteObject(T entity) {
        entityManager.remove(entity);
    }

    @Override
    public List<T> findAll() {
        Query query = entityManager.createQuery("FROM " + thisClass.getSimpleName());
        return query.getResultList();
    }


    @Override
    public void dropAll() {
        Query query = entityManager.createQuery("DELETE FROM " + thisClass.getSimpleName());
        query.executeUpdate();
    }

    @PersistenceContext(name = "prototype-persistence-unit")
    public void setEntityManager(EntityManager entityManager){
        this.entityManager = entityManager;
    }
}
