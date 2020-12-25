package com.example.shop

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties("shop")
data class ShopProperties(var title: String, val banner: Banner) {
    data class Banner(val title: String? = null, val content: String)
}
