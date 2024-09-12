package com.example.demo.message.controller;

import com.example.demo.message.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MessageController {

    private final MessageService messageService;

    @PostMapping("/message")
    public void createMessage(@RequestParam long fromId, @RequestParam long toId, @RequestParam String content) {
        messageService.createMessage(fromId, toId, content);
    }

    @PostMapping("/groupmessage")
    public void createGroupMessage(@RequestParam long chatRoomId, @RequestParam long userId, @RequestParam String content) {
        messageService.createGroupMessage(chatRoomId, userId, content);
    }
}
