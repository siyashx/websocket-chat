package com.alibou.websocket.chat;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {

    private Long id;

    private Long userId;

    private String isSeenId;

    private Boolean isForwarded;

    private String forwardedId;

    private Boolean isCustomer;

    private Boolean isAdmin;

    private String message;

    private String time;

    private String date;

}
