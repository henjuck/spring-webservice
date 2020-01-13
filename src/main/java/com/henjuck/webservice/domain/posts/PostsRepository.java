package com.henjuck.webservice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * PostsRepository
 */
public interface PostsRepository extends JpaRepository<Posts, Long> {

}