package com.iiht.tweetapp.model;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


import io.swagger.v3.oas.annotations.media.Schema;
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
    @Schema(description = "First name of the user", required = true, example = "Steve")
    @NotBlank(message = "First name should not be empty")
    private String firstName;
    @Field
    @Schema(description = "Last name of the user", required = true, example = "Harvey")
    @NotBlank(message = "Last name should not be empty")
    private String lastName;
    @Id
    @Schema(description = "user name of the user", required = true, example = "harvey@gmail.com")
    @Pattern(regexp = "[a-zA-Z0-9@.]*$", message = "user name should contain only alphabets and digits")
    private String userName;
    @Field
    @Schema(description = "Password of the user", required = true, example = "Steve123")
    @NotBlank(message = "Password should not be empty")
    @Size(min = 8, message = "minimum 8 Characters required")
    private String password;
    @Field
    @Schema(description = "Contact Number of the user", required = true, example = "9999988888")
    private long contactNo;

}
