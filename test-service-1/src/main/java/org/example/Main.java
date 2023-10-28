package org.example;

import brave.Span;
import brave.Tracing;
import io.micrometer.tracing.annotation.NewSpan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@AutoConfiguration
@EnableScheduling
@RestController
public class Main {
    Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }

    @GetMapping("/hello")
    public String test() {
        logger.info("hello, world!");
        return "hello, world!";
    }

    @Scheduled(cron = "0/5 * * * * *")
    @NewSpan
    public void testScheduling() {
        Span span = Tracing.currentTracer().newTrace();
        span.name("testScheduling");
        span.start();
        span.tag("time", System.currentTimeMillis() + "");
        logger.info("time:" + System.currentTimeMillis());
        span.finish();
    }

}