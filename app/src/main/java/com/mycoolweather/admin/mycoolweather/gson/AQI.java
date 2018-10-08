package com.mycoolweather.admin.mycoolweather.gson;

/**
 * Created by admin on 2018/9/28.
 */

public class AQI {
    public AQICity city;

    public class  AQICity{
        public String aqi; //全称Air Quality Index，是环境空气质量指数
        public String pm25; //Particulate matter 2.5的缩写，指大气中直径小于或等于2.5微米的颗粒物
    }
}
