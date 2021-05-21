package com.example.demo.entity;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data 
public class Todo {

    private Long id;

    @NotBlank
    private String task;
}
