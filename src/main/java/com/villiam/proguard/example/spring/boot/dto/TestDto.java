package com.villiam.proguard.example.spring.boot.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @author villiam
 *
 * @date 2020-11-14
 */
@Data
@Builder
public class TestDto {
    private String variableString;
    private int variableInt;
    private Object variableObject;
}