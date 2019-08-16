package com.jiuhua.coolweather.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {
    private int id;//主键
    private String cityName;//城市名
    private int cityCode;//城市代号
    private int provinceId;//所属省份id

    public int getId() {
        return id;
    }

    public String getCityName() {
        return cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
