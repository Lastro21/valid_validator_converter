package com.example.demo.response.allResponseModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@AllArgsConstructor
public class ResponseModel {

    private String statusError;
    private String messageError;
    private String customMessage;

}
