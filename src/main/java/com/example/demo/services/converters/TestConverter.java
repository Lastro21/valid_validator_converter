package com.example.demo.services.converters;

import com.example.demo.models.TestModel;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;


@Service
public class TestConverter implements Converter<String, TestModel> {

    @Override
    public TestModel convert(String str) {

        String[] parts = str.split(";");
        String part1 = parts[0];
        String part2 = parts[1];
        return new TestModel(part1, part2);

    }

}
