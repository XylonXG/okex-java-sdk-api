package com.okcoin.commons.okex.open.api.test.ws.futures.config;


/**
 * webSocket config
 *
 * @author oker
 * @date 2019/7/5 1:57 AM
 */
public class WebSocketConfig {
    // okex webSocket url
    private static final String SERVICE_URL = "wss://real.okex.com:8443/ws/v3?_compress=false";
    // api key
    private static final String API_KEY = "";
    // secret key
    private static final String SECRET_KEY = "";
    // passphrase
    private static final String PASSPHRASE = "";

    public static void publicConnect(WebSocketClient webSocketClient) {
        webSocketClient.connection(SERVICE_URL);
    }

    public static void loginConnect(WebSocketClient webSocketClient) {
        //与服务器建立连接
        webSocketClient.connection(SERVICE_URL);
        //登录账号,用户需提供 api-key，passphrase,secret—key 不要随意透漏 ^_^
        webSocketClient.login(API_KEY , PASSPHRASE , SECRET_KEY);
    }
}
