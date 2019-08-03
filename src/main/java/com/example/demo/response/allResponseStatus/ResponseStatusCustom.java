package com.example.demo.response.allResponseStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public enum ResponseStatusCustom {

    SUCCESS("200"), BAD_REQUEST("400"), ACCEPTED("202"),
    CREATED("201"), METHOD_NOT_ALLOWED("405"), NOT_ACCEPTABLE("406"),
    CONFLICT("409"), SERVER_ERROR("500"), NOT_IMPLEMENTED("501");

    private String valueStatus;

}
