package com.villiam.proguard.example.spring.boot.service;

import com.villiam.proguard.example.spring.boot.dto.TestDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author villiam
 *
 * @date 2020-11-14
 */
@Slf4j
@Service
public class ExampleService {
    private TestDto exampleDto;

    public ExampleService() {
        this.exampleDto = TestDto.builder()
            .variableInt(200)
            .variableString("Test villiam")
            .variableObject(new Object())
            .build();
    }

    public int calculate() {
        return exampleDto.getVariableInt() * 20;
    }
}