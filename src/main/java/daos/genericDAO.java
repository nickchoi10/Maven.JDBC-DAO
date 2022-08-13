package daos;

import java.util.List;

public interface genericDAO <T>{
    public T findById(int id);
    public List findAll();
    public void update (T dto);
    public void create(T dto);
    public void delete(int id);
}
