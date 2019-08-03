package com.example.demo.response.allResponseMessages;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ResponseMessages {

    MESSAGE_SECCESS("Request was accept"), MESSAGE_BAD_REQUEST("Request was reject");

    private String valueMessage;

}
