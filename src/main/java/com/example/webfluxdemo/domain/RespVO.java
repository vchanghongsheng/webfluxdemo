package com.example.webfluxdemo.domain;

import java.util.Map;

/**
 * @program: webfluxdemo
 * @description:
 * @author: hons.chang
 * @since: 2023-07-27 08:23
 **/
public class RespVO<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误信息
     */
    private String msg;

    /**
     * 返回数据
     */
    private T data;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public RespVO(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> RespVO<T> success(T data) {
        RespVO success = new RespVO(200, "success", data);
        return success;
    }
}
