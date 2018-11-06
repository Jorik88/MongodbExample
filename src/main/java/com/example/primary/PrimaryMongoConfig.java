package com.example.primary;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages =
        "com.example.primary.repository",
        mongoTemplateRef = "primaryMongoTemplate")
public class PrimaryMongoConfig {
}
