package com.eharoldreyes

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication(scanBasePackages = ["com.eharoldreyes.course", "com.eharoldreyes.topic"])
@EnableAutoConfiguration(exclude = [DataSourceAutoConfiguration::class, HibernateJpaAutoConfiguration::class])
class OnlineTutorialApplication

fun main(args: Array<String>) {
	runApplication<OnlineTutorialApplication>(*args)
}
