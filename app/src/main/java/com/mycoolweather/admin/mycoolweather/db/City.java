package com.mycoolweather.admin.mycoolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by admin on 2018/9/25.
 */

public class City extends DataSupport{

    private int id; //每个实体类应有的字段

    private String cityName; //市名

    private int cityCode; //市代号

    private int provinceId; //当前市所在的省id值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
