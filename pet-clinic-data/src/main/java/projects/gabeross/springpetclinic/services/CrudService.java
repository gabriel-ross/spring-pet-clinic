package projects.gabeross.springpetclinic.services;

import java.util.Set;
// What exactly is the purpose of this crud service?
// I guess the three services had redundant code that was CRUD that this is supposed to simplify
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
