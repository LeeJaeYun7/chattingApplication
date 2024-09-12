package com.example.demo.message.entity

import com.example.demo.chatRoom.entity.ChatRoom
import com.example.demo.global.entity.BaseTimeEntity
import com.example.demo.user.entity.User
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne

@Entity
class GroupMessage(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @ManyToOne
    var chatRoom: ChatRoom? = null,

    @ManyToOne
    var user: User? = null,

    var content: String? = null
) : BaseTimeEntity() {

    companion object {
        fun of(chatRoom: ChatRoom, user: User, content: String): GroupMessage {
            return GroupMessage(
                chatRoom = chatRoom,
                user = user,
                content = content
            )
        }
    }
}