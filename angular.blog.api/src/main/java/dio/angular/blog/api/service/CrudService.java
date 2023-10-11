package dio.angular.blog.api.service;

import java.util.List;

public interface CrudService<Integer, T> {
    List<T> findAll();
    T findById(Integer id);
    T create(T entity);
    T update(Integer id, T entity);
    void delete(Integer id);
}
