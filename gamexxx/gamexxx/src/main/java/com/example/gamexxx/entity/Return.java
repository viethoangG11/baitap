package com.example.gamexxx.entity;

public class Return {

    private String status;
    private String errorCode;

    public Return(String status, String errorCode) {
        this.status = status;
        this.errorCode = errorCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}

