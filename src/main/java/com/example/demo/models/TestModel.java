package com.example.demo.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class TestModel {

    @Size(min = 5, max = 10, message = "Must be min 5 and max 10 char - str1")
    private String str1;

    @Size(min = 5, max = 10, message = "Must be min 5 and max 10 char - str2")
    private String str2;

}
