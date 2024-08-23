package com.iiht.tweetapp.repository;

import com.iiht.tweetapp.model.TweetDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface TweetRepository extends MongoRepository<TweetDetails, UUID> {
    Optional<TweetDetails> findByUsername(String username);
}
