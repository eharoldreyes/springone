package com.eharoldreyes.topic

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface TopicRepository: CrudRepository<Topic, String> {

}