package com.example.demo.controllers;

import com.example.demo.models.TestModel;
import com.example.demo.services.converters.TestConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConverterController {

    private TestConverter testConverter;

    String originString = "any;text";

    @RequestMapping(value = "/convert")
    public TestModel rrt() {

        return testConverter.convert(originString);

    }

    @Autowired
    public void setTestConverter(TestConverter testConverter) {
        this.testConverter = testConverter;
    }
}
