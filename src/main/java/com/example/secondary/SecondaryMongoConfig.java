package com.example.secondary;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages =
        "com.example.secondary.repository",
        mongoTemplateRef = "secondaryMongoTemplate")
public class SecondaryMongoConfig {
}
