package dio.angular.blog.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dio.angular.blog.api.model.Tag;

@Repository
public interface TagRepository extends JpaRepository<Tag, Integer> {
    
}
