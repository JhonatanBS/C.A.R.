package com.car.appCar

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AppCarApplication

fun main(args: Array<String>) {
	runApplication<AppCarApplication>(*args)
}
