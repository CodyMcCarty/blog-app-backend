package com.example.backend.blog;

import javax.persistence.*;
import lombok.*;

@Table(name = "blog")
@Entity
@Getter
@Setter
@ToString
public class Blog {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(nullable = false)
  private Long id;

  private String author;

  private String title;

  @Lob
  @Column(name = "blog_post", nullable = false)
  private String blogPost;

  public Blog() {
  }

  public Blog(String author, String title, String blogPost) {
    this.author = author;
    this.title = title;
    this.blogPost = blogPost;
  }

  public Blog(Long id, String author, String title, String blogPost) {
    this.id = id;
    this.author = author;
    this.title = title;
    this.blogPost = blogPost;
  }
}