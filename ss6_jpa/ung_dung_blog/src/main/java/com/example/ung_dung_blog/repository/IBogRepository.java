package com.example.ung_dung_blog.repository;

import com.example.ung_dung_blog.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBogRepository extends JpaRepository<Blog, Long> {
}
