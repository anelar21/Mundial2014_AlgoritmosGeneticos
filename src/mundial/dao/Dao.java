

package mundial.dao;

import java.util.List;


public interface Dao<K,E> {
    public void persistir(E entidad);
    public void elimninar(E entidad);
    public void update (E entidad);
    public void read (E entidad);

    public E encontrarPorId(K id);
    public List<E> encontrarTodos();
    
}
