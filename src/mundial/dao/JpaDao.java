

package mundial.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class JpaDao<K, E> implements Dao<K, E> {
    private EntityManagerFactory emf;
    private EntityManager em;

    public JpaDao() {
        emf = Persistence.createEntityManagerFactory("MundialPU");
        em = emf.createEntityManager();
    }

    public EntityManagerFactory getEmf() {
        return emf;
    }

    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    @Override
    public void persistir(E entidad) {
        em.getTransaction().begin();
        em.persist(entidad);
        em.getTransaction().commit();
    }
    public void modificar(E entidad) {
        em.getTransaction().begin();
        em.merge(entidad);
        em.getTransaction().commit();
    }

    @Override
    public void elimninar(E entidad) {
        em.remove(entidad);
    }

    @Override
    public void update(E entidad) {
    }

    @Override
    public void read(E entidad) {
    }

    @Override
    public E encontrarPorId(K id) {
        return null;
    }

    @Override
    public List<E> encontrarTodos() {
        return null;
    }
    
}
