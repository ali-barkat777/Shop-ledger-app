package com.App.Shop_Ledger.User;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepo extends MongoRepository<Users, String> {

    List<Users> findByUsername(String username);


    boolean existsByUsernameAndRole(String username, String role);




}
