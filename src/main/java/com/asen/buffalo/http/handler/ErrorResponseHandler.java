package com.asen.buffalo.http.handler;

/**
 * @description: http请求错误返回(status < 200 | | status > = 300)处理器
 * @author: Asen
 * @since: 2020/05/19
 */
public interface ErrorResponseHandler {
    /**
     * 具体处理逻辑
     *
     * @param url      请求路径
     * @param status   http请求返回状态码
     * @param response http请求返回httpEntity
     */
    void handle(String url, int status, String response);
}