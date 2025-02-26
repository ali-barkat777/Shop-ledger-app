package com.App.Shop_Ledger.WebSocket;

import com.App.Shop_Ledger.User.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatUserService {

    @Autowired
    ChatUserRepo userRepo;
    public void disconnectUser(ChatUser users){
        ChatUser users1 = (ChatUser) userRepo.findByNickName(users.getNickName());

        if ( users1 != null){
            users1.setStatus(Status.OFFLINE);
            userRepo.save(users1);
        }
    }

    public List<Users> getConnectedUsers(){
        return userRepo.findAllByStatus(Status.ONLINE);
    }

    public ChatUser addUser(ChatUser user) {
        user.setStatus(Status.ONLINE);
        return userRepo.save(user);
    }
}
