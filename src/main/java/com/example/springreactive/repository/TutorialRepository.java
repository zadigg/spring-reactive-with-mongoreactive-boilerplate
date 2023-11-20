package com.example.springreactive.repository;

import com.example.springreactive.domain.Tutorial;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface TutorialRepository extends ReactiveMongoRepository<Tutorial, String> {
    Flux<Tutorial> findByPublished(boolean published);

    Flux<Tutorial> findByTitleContaining(String title);
}