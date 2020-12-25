package com.example.shop

import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ShopConfiguration {

    @Bean
    fun databaseInitializer(userRepository: UserRepository,
                            articleRepository: ArticleRepository) = ApplicationRunner {
        val dream = userRepository.save(User("dream9004", "dream", "kim"))

        articleRepository.save(Article(
                title = "Reactor Bismuth is out",
                headline = "Lorem ipsum",
                content = "dolor sit amet",
                author = dream
        ))

        articleRepository.save(Article(
                title = "Webflux Aluminium has landed",
                headline = "Lorem ipsum2",
                content = "web sit amet",
                author = dream
        ))
    }
}
