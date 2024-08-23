package com.iiht.tweetapp.repository;


import com.iiht.tweetapp.model.UserData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends MongoRepository<UserData, String> {

}