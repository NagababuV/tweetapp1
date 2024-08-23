package com.iiht.tweetapp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTweet {


    private UUID id;
    private String handleName;
    private String message;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime time;
    private String username;
    private Set<String> likes;
    private List<String> replies;
    private String fname;
    private String lname;
    private boolean Status;
}
