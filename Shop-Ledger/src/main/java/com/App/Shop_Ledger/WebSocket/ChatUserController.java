package com.App.Shop_Ledger.WebSocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatUserController {

    @Autowired
    ChatUserService userService;


    @MessageMapping("/user.addUser")
    @SendTo("/user/topic")
    public ChatUser addUser(ChatUser user){
        userService.addUser(user);
        return user;
    }
    @MessageMapping("user/disconnect")
    @SendTo("/user")
    public void disconnect(ChatUser user){
        userService.disconnectUser(user);
    }
}
