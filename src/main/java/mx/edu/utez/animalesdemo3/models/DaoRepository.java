package mx.edu.utez.animalesdemo3.models;


import java.util.List;

public interface DaoRepository<T>{
    List<T> findall();
    T findOne(int id);
    boolean create(T object);
    boolean delete(int id);
    boolean update(T object, int id);
}
