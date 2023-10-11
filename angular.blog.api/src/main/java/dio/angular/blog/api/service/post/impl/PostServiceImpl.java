package dio.angular.blog.api.service.post.impl;

import java.util.List;
import static java.util.Optional.ofNullable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dio.angular.blog.api.model.Post;
import dio.angular.blog.api.repository.PostRepository;
import dio.angular.blog.api.service.exception.BusinessException;
import dio.angular.blog.api.service.exception.NotFoundException;
import dio.angular.blog.api.service.post.PostService;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> findAll() {
        return this.postRepository.findAll();
    }

    @Override
    public Post findById(Integer id) {
        return this.postRepository.findById(id).orElseThrow(NotFoundException::new);
    }

    @Override
    public Post create(Post postToCreate) {
        ofNullable(postToCreate).orElseThrow(() -> new BusinessException("Post to create must not be null."));
        return this.postRepository.save(postToCreate);
    }

    @Override
    public Post update(Integer id, Post entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    
}
