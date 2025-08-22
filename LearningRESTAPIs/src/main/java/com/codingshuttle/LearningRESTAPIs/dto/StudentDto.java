package com.codingshuttle.LearningRESTAPIs.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor       // generates public StudentDto(int id, String name, String email) {}
@NoArgsConstructor        // generates public StudentDto() {}

public class StudentDto {
    private Long id;
    private String name;
    private String email;
}