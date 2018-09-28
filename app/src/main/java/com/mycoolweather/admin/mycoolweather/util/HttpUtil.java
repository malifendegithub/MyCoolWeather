package com.mycoolweather.admin.mycoolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by admin on 2018/9/25.
 * 与服务器交互
 * 即发起一条HTTP请求只需调用sendOkHttpRequest方法，传入请求地址
 * 并注册一个回调处理服务器响应
 */

public class HttpUtil {
   public static void sendOkHttpRequest(String address,okhttp3.Callback callback) {
       OkHttpClient client =  new OkHttpClient();
       Request request = new Request.Builder().url(address).build();
       client.newCall(request).enqueue(callback);
    }

}
