package com.javareactor.spring_with_reactor.repositories;

import com.javareactor.spring_with_reactor.entities.Post;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PostRepository extends org.springframework.data.repository.Repository<Post, Long> {
    Mono<Post> save(Post post);
    Flux<Post> findAll();
}
