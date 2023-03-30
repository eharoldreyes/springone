package com.eharoldreyes.course

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class CourseController {

    @Autowired
    private lateinit var courseService: CourseService

    @GetMapping("/courses")
    fun getCourses() : List<Course> {
        return courseService.getCourses()
    }

    @GetMapping("/courses/{id}")
    fun getCourse(@RequestParam id: String) : Course? {
        return courseService.getCourse(id)
    }

    @PostMapping("/courses")
    fun addCourse(course: Course): Course {
        return courseService.addCourse(course)
    }

    @PutMapping("/courses/{id}")
    fun updateCourse(@RequestParam id: String, @RequestBody course: Course): Course {
        return courseService.updateCourse(id, course)
    }

    @DeleteMapping("/courses/{id}")
    fun deleteCourse(@RequestParam id: String) {
        courseService.deleteCourse(id)
    }

}