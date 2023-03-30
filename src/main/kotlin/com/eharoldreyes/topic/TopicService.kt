package com.eharoldreyes.topic

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TopicService {

    @Autowired
    private lateinit var topicRepository: TopicRepository

    fun getTopics(): List<Topic> {
        return topicRepository.findAll().toList()
    }

    fun getTopic(id: String): Topic? {
        return topicRepository.findById(id).get()
    }

    fun addTopic(topic: Topic): Topic {
        return topicRepository.save(topic)
    }

    fun updateTopic(id: String, topic: Topic): Topic {
        topicRepository.deleteById(id)
        return topicRepository.save(topic.copy(id = id))
    }

    fun deleteTopic(id: String) {
        return topicRepository.deleteById(id)
    }

}