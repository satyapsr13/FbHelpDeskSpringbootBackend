package com.fbhelpdesk.fbhelpdesk.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collation = "user")
public class User {

    @Id
    private  String userId;
    private  String email;
    private  String password;
    private  String name;
}
