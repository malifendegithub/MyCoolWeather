package com.mycoolweather.admin.mycoolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin on 2018/9/28.
 */

public class Forecast {  //天气预报
     public String date;

     @SerializedName("tmp")   //温度
    public Temperature temperature;

     @SerializedName("cond")
     public More more;

     public class Temperature{
         public String max;  //最高温度
         public String min;  //最低温度
     }
     public class More{
         @SerializedName("txt_d")
         public String info;
     }


}
