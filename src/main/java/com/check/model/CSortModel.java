package com.check.model;

import java.util.Date;

/**
 * Created by C0034 on 2018/3/15.
 */

public class CSortModel {
    private Integer delcd;   //数据是否有效 1：有效 0：无效
    private Date timestamp;  //登记日期
    private Integer id;      //主键
    private String name;     //点检分类名称
    private int odr;         //顺序
    private String remark;   //备注

    @Override
    public String toString() {
        return "CSortModel{" +
                "delcd=" + delcd +
                ", timestamp=" + timestamp +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", odr=" + odr +
                ", remark='" + remark + '\'' +
                '}';
    }

    public Integer getDelcd() {
        return delcd;
    }

    public void setDelcd(Integer delcd) {
        this.delcd = delcd;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOdr() {
        return odr;
    }

    public void setOdr(int odr) {
        this.odr = odr;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
