package com.example.backend.blog;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/blog")
//@CrossOrigin("http://localhost:3000/")
@CrossOrigin("https://blog-react-springboot-psql.herokuapp.com")
public class BlogController {

  private final BlogService blogService;

  @Autowired
  public BlogController(BlogService blogService) {
    this.blogService = blogService;
  }

  @GetMapping
  public List<Blog> getBlogs() {
    return blogService.getBlogs();
  }
}
