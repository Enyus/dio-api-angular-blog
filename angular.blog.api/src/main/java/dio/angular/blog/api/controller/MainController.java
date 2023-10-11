package dio.angular.blog.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    
    @GetMapping("/")
    public ResponseEntity<Object> home(){
        return ResponseEntity.ok("<a href='https://github.com/Enyus/dio-api-angular-blog'>Angular Blog API</a>");
    }
}
