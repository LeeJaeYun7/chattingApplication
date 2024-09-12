package com.example.demo.chatRoom.service;


import com.example.demo.chatRoom.entity.ChatRoom;
import com.example.demo.chatRoom.repository.ChatRoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ChatRoomService {

    public ChatRoomRepository chatRoomRepository;


    public Optional<ChatRoom> getChatRoomById(long chatRoomId){
        return chatRoomRepository.findById(chatRoomId);
    }

}
