package com.fbhelpdesk.fbhelpdesk.repository;

import com.fbhelpdesk.fbhelpdesk.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {


}
