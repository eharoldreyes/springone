package com.eharoldreyes.course

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CourseService {

    @Autowired
    private lateinit var courseRepository: CourseRepository

    fun getCourses(): List<Course> {
        return courseRepository.findAll().toList()
    }

    fun getCourse(id: String): Course? {
        return courseRepository.findById(id).get()
    }

    fun addCourse(course: Course): Course {
        return courseRepository.save(course)
    }

    fun updateCourse(id: String, course: Course): Course {
        courseRepository.deleteById(id)
        return courseRepository.save(course.copy(id = id))
    }

    fun deleteCourse(id: String) {
        return courseRepository.deleteById(id)
    }

}