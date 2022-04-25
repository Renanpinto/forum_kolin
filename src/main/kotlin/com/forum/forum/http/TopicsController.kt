package com.forum.forum.http

import com.forum.forum.domain.Topic
import com.forum.forum.usecase.TopicCrud
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/topics")
class ForumController(private val crud: TopicCrud) {


    @GetMapping
    fun findAll(): List<Topic> {
        return crud.list()
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): Topic {
        return crud.findById(id)
    }
}