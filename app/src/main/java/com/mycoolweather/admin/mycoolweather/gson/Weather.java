package com.mycoolweather.admin.mycoolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by admin on 2018/9/28.
 */

public class Weather {
    public String status; //状态

    public Basic basic;  //基本天气情况

    public AQI aqi; //空气污染指数

    public Now now;  //目前的天气情况

    public Suggestion suggestion;  //生活建议

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
