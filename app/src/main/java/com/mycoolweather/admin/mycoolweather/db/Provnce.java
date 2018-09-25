package com.mycoolweather.admin.mycoolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by admin on 2018/9/25.
 * 如查看苏州天气：即访问接口：
 * http://guolin.tech/api/weather?cityid=CN101190401&key=bc0418b57b2d4918819d3974ac1285d9
 */

public class Provnce extends DataSupport {
    private int id; //每个实体类应有的字段

    private String provinceName; //省名

    private int provinceCode; //省的代号

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
