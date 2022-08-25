package com.ducpm.reminiscent.model.response;

import lombok.Data;

@Data
public class DataResponse {
    private int code;

    public DataResponse(int code) {
        this.code = code;
    }
}
