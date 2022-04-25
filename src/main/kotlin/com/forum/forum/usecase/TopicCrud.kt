package com.forum.forum.usecase

import com.forum.forum.domain.Course
import com.forum.forum.domain.Topic
import com.forum.forum.domain.UserForum
import org.springframework.stereotype.Service

@Service
class TopicCrud(private var topics: List<Topic>) {

    init {
        val topic1 = Topic(
                id = 1,
                title = "titulo",
                message = "message",
                course = Course(
                        id = 1,
                        name = "Nome",
                        category = "Categoria"
                ),
                author = UserForum(
                        id = 1,
                        name = "Nome",
                        email = "email"
                )
        )

        val topic2 = Topic(
                id = 2,
                title = "titulo",
                message = "message",
                course = Course(
                        id = 1,
                        name = "Nome",
                        category = "Categoria"
                ),
                author = UserForum(
                        id = 1,
                        name = "Nome",
                        email = "email"
                )
        )

        val topic3 = Topic(
                id = 3,
                title = "titulo",
                message = "message",
                course = Course(
                        id = 1,
                        name = "Nome",
                        category = "Categoria"
                ),
                author = UserForum(
                        id = 1,
                        name = "Nome",
                        email = "email"
                )
        )
        topics = listOf(topic1, topic2, topic3)
    }

    fun list(): List<Topic> {
        return topics
    }

    fun findById(id: Long): Topic {
        return topics.first { topic -> topic.id == id }
    }
}
