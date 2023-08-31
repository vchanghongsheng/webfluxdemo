package com.example.webfluxdemo.domain;

/**
 * @program: webfluxdemo
 * @description:
 * @author: hons.chang
 * @since: 2023-07-27 08:26
 **/
public class TokenVO {


    /**
     * access_token
     */

    private String accessToken;


    /**
     * expires_in : 157679999
     */
    private Integer expiresIn;


    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }


    public Integer getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }
}
