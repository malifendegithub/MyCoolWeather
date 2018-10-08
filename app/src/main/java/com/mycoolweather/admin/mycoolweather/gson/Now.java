package com.mycoolweather.admin.mycoolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin on 2018/9/28.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature; //温度

    @SerializedName("cond")   //更多天气情况
    public More more;

    public class More{
        @SerializedName("text")
        public String info;
    }

}
