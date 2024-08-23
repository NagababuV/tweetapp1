package com.iiht.tweetapp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.UUID;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "tweet_details")
public class TweetDetails {

    @Id
    private UUID id;
    @Field
    private String handleName;
    @Field
    private String message;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime time;
    @Field
    private String username;
    @Field
    private Set<String> likes;
    @Field
    private List<String> replies;
    @Field
    private boolean Status;

}
