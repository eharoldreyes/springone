package com.eharoldreyes.topic

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class TopicController {

    @Autowired
    private lateinit var topicService: TopicService

    @GetMapping("/topics")
    fun getTopics() : List<Topic> {
        return topicService.getTopics()
    }

    @GetMapping("/topics/{id}")
    fun getTopic(@RequestParam id: String) : Topic? {
        return topicService.getTopic(id)
    }

    @PostMapping("/topics")
    fun addTopic(topic: Topic): Topic {
        return topicService.addTopic(topic)
    }

    @PutMapping("/topics/{id}")
    fun updateTopic(@RequestParam id: String, @RequestBody topic: Topic): Topic {
        return topicService.updateTopic(id, topic)
    }

    @DeleteMapping("/topics/{id}")
    fun deleteTopic(@RequestParam id: String) {
        topicService.deleteTopic(id)
    }

}