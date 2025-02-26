package com.App.Shop_Ledger.WebSocket;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChatUser {
    private String nickName;
    private String fullName;
    private Status status;
}
