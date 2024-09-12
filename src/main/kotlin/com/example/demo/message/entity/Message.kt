package com.example.demo.message.entity

import com.example.demo.global.entity.BaseTimeEntity
import com.example.demo.user.entity.User
import jakarta.persistence.*

@Entity
class Message(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null, // Nullable로 설정하여 자동 생성된 ID를 지원합니다.

    @OneToOne
    var from: User? = null,

    @OneToOne
    var to: User? = null,

    var content: String? = null
) : BaseTimeEntity() {

    companion object {
        fun of(from: User, to: User, content: String): Message {
            return Message(
                from = from,
                to = to,
                content = content
            )
        }
    }
}