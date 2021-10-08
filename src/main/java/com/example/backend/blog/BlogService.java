package com.example.backend.blog;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogService {

  private final BlogRepository blogRepository;

  @Autowired
  public BlogService(BlogRepository blogRepository) {
    this.blogRepository = blogRepository;
  }

  public List<Blog> getBlogs() { return blogRepository.findAll(); }
}
