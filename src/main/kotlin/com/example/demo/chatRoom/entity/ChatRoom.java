package com.example.demo.chatRoom.entity;

import com.example.demo.global.entity.BaseTimeEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ChatRoom extends BaseTimeEntity {

    @Id
    private long id;
}
