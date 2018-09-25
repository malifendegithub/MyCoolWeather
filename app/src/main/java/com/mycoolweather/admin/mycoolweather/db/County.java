package com.mycoolweather.admin.mycoolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by admin on 2018/9/25.
 */

public class County extends DataSupport {

    private int id ; //每个实体类应有id

    private String countyName ; //县名

    private String weatherId ; //该县对应的天气id

    private int cityId ; //当前县所属的城市id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
