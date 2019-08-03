package com.example.demo.controllers;

import com.example.demo.models.TestModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

@RestController
public class ValidatorController {

    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    Validator validator = factory.getValidator();

    @RequestMapping(value = "/valid")
    public String rrt() {

        TestModel testModel = new TestModel("1234567", "1234567");

        Set<ConstraintViolation<TestModel>> constraintViolations = validator.validate(testModel);

        //Show errors
        if (constraintViolations.size() > 0) {
            for (ConstraintViolation<TestModel> violation : constraintViolations) {
                System.out.println(violation.getMessage());
            }
        } else {
            System.out.println("Valid Object");
        }

        return "";
    }

}
