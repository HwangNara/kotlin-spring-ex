package com.example.shop

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.data.repository.findByIdOrNull

@DataJpaTest
class RepositoriesTests @Autowired constructor(
        val userRepository: UserRepository,
        val articleRepository: ArticleRepository) {

    @Test
    fun `When findByIdOrNull then return Article`() {
        val nara = User("springnara", "nara", "hwang")
        userRepository.save(nara)
        val article = Article("Spring Framework 5.0", "Dear Spring community", "Lorem ipsum", nara)
        articleRepository.save(article)
        val found = articleRepository.findByIdOrNull(article.id!!)
        assertThat(found).isEqualTo(article)
    }

    @Test
    fun `When findByLogin then return User`() {
        val nara = User("springnara", "nara", "hwang")
        userRepository.save(nara)
        val user = userRepository.findByLogin(nara.login)
        assertThat(user).isEqualTo(nara)
    }
}
