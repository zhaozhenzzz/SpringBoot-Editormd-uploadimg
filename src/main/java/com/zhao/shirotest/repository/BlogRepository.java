package com.zhao.shirotest.repository;

import com.zhao.shirotest.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long> {
    public Blog  findBlogById(Long id);
}
