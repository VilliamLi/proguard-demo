package com.slm.proguard.example.spring.boot;

import com.slm.proguard.example.spring.boot.service.ExampleService;
import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

/**
 * @author villiam
 *
 * @date 2020-11-14
 */

@AllArgsConstructor
@SpringBootApplication
public class Application {
    private final ExampleService exampleService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @PostConstruct
    public void testOutput() {
        System.out.println("#");
        System.out.println("###");
        System.out.println("##################################### Test Output ##################################");
        System.out.println("{}"+exampleService.calculate());
    }
}