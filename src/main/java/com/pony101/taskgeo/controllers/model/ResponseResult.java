package com.pony101.taskgeo.controllers.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class ResponseResult implements Serializable {

    private Integer code;
    private String msg;
    private Object data;

}
