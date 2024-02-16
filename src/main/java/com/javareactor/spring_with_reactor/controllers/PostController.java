package com.javareactor.spring_with_reactor.controllers;

import com.javareactor.spring_with_reactor.entities.Post;
import com.javareactor.spring_with_reactor.repositories.PostRepository;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    private final PostRepository postRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @PostMapping
    public Mono<Post> createPost(@RequestBody Post post) {
        return postRepository.save(post);
    }

    @GetMapping
    public Flux<Post> getAllPosts() {
        return postRepository.findAll();
    }
}
