package com.example.shop

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(ShopProperties::class)
class ShopApplication

fun main(args: Array<String>) {
    runApplication<ShopApplication>(*args)
}
