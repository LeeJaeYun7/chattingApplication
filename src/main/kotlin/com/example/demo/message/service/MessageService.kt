package com.example.demo.message.service

import com.example.demo.chatRoom.service.ChatRoomService
import com.example.demo.message.entity.GroupMessage
import com.example.demo.message.entity.Message
import com.example.demo.message.repository.GroupMessageRepository
import com.example.demo.message.repository.MessageRepository
import com.example.demo.user.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MessageService @Autowired constructor(
    private val userService: UserService,
    private val chatRoomService: ChatRoomService,
    private val messageRepository: MessageRepository,
    private val groupMessageRepository: GroupMessageRepository
){

    fun createMessage(fromId: Long, toId: Long, content: String) {
        val from = userService.getUserById(fromId);
        val to = userService.getUserById(toId);

        if(from.isPresent && to.isPresent) {
            val message = Message.of(from.get(), to.get(), content)
            messageRepository.save(message);
        }
    }

    fun createGroupMessage(chatRoomId: Long, userId: Long, content: String){
        val chatRoom = chatRoomService.getChatRoomById(chatRoomId)
        val user = userService.getUserById(userId)

        if(chatRoom.isPresent && user.isPresent) {
            val groupMessage = GroupMessage.of(chatRoom.get(), user.get(), content)
            groupMessageRepository.save(groupMessage)
        }
    }
}