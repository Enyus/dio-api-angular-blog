package dio.angular.blog.api.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import dio.angular.blog.api.model.Post;
import dio.angular.blog.api.service.post.PostService;

@RestController
public class PostController {

    @Autowired
    private PostService postService;
    
    @GetMapping("posts")
    public ResponseEntity getPosts(){
        return ResponseEntity.ok(postService.findAll());
    }

    @GetMapping("post/{id}")
    public ResponseEntity getPostById(@PathVariable Integer id){
        return ResponseEntity.ok(postService.findById(id));
    }

    @PostMapping("post")
    public ResponseEntity<Post> createPost(@RequestBody Post post) {
        var createdPost = postService.create(post);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdPost.getId())
                .toUri();
        return ResponseEntity.created(location).body(createdPost);
    }
}
