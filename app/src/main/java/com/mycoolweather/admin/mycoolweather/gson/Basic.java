package com.mycoolweather.admin.mycoolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin on 2018/9/28.
 */

public class Basic {
    @SerializedName("city") //城市
    public String cityName;

    @SerializedName("id")   //天气
    public String weatherId;

    public Update update;  //更新的时间

    public class Update {
        @SerializedName("loc")
        public String updateTime;

    }

}
