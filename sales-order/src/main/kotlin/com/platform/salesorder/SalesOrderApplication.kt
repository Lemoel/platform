package com.platform.salesorder

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class SalesOrderApplication

fun main(args: Array<String>) {
	runApplication<SalesOrderApplication>(*args)
}
