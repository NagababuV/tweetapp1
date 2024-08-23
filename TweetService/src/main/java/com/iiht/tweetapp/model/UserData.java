package com.iiht.tweetapp.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection = "user_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserData {

    @Field
    private String firstName;
    @Field
    private String lastName;
    @Id
    private String userName;
    @Field
    private String password;
    @Field
    private long contactNo;

}
