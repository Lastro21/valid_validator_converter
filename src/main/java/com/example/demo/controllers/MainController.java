package com.example.demo.controllers;

import com.example.demo.models.TestModel;
import com.example.demo.response.allResponseMessages.ResponseMessages;
import com.example.demo.response.allResponseModel.ResponseModel;
import com.example.demo.response.allResponseStatus.ResponseStatusCustom;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class MainController {


    @RequestMapping(value = "/",
            method = RequestMethod.GET,
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity rrt(@Valid @RequestBody TestModel testModel, BindingResult result) {

        if (result.hasErrors()) {
            return ResponseEntity
                    .status(Integer.parseInt(ResponseStatusCustom.BAD_REQUEST.getValueStatus()))
//                    .header("Location2","http://localhost:7001/widget2")
                    .header("Reason", String.valueOf(result.getAllErrors()))
                    .body(new ResponseModel(ResponseStatusCustom.BAD_REQUEST.getValueStatus(), ResponseMessages.MESSAGE_BAD_REQUEST.getValueMessage(), String.valueOf(result.getFieldError().getDefaultMessage())));
//                    .build();
        } else {

            return ResponseEntity
                    .status(Integer.parseInt(ResponseStatusCustom.SUCCESS.getValueStatus()))
//                    .header("Location2","http://localhost:7001/widget2")
//                    .header("Location2","http://localhost:7001/widget2")
                    .body(new ResponseModel(ResponseStatusCustom.SUCCESS.getValueStatus(), ResponseMessages.MESSAGE_SECCESS.getValueMessage(), String.valueOf(result.getAllErrors())));
//                    .build();

        }

//        return ResponseEntity
//                .status(200)
//                .build();


    }

}
