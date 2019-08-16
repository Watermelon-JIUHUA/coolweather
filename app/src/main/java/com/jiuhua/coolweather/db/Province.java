package com.jiuhua.coolweather.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {
    private int id;//主键
    private String provinceName;//省份名
    private int provinceCode;//省份代号

    public int getId() {
        return id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
