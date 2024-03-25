package com.example.test_filway;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestFilwayApplication {
    @Autowired
    private Flyway flyway;
    public static void main(String[] args) {
        SpringApplication.run(TestFilwayApplication.class, args);
    }
    public void migrateAtRuntime() {
        flyway.migrate();  // Manually trigger migration
    }

}
