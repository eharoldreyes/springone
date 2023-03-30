package com.eharoldreyes.course

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CourseRepository: CrudRepository<Course, String> {

}