package com.example.demo.message.repository
import com.example.demo.message.entity.GroupMessage
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface GroupMessageRepository : JpaRepository<GroupMessage, Long>