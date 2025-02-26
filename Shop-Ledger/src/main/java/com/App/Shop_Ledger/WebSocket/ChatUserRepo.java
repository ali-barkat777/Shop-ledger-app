package com.App.Shop_Ledger.WebSocket;

import com.App.Shop_Ledger.User.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface ChatUserRepo extends MongoRepository<ChatUser, String> {
    List<Users> findAllByStatus(Status status);

    Object findByNickName(String nickName);

}
