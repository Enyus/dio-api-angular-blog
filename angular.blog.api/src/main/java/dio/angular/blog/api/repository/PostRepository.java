package dio.angular.blog.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dio.angular.blog.api.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer>  {
    
}
