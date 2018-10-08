package com.mycoolweather.admin.mycoolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin on 2018/9/28.
 */

public class Suggestion {    //建议
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }
    public class CarWash{
        @SerializedName("txt")
        public String info;
    }
    public class Sport{
        @SerializedName("txt")
        public String info;
    }

}
