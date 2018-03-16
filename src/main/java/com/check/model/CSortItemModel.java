package com.check.model;

import java.util.Date;

/**
 * Created by C0034 on 2018/3/15.
 */
public class CSortItemModel {

    private Integer delcd;//数据是否有效 1：有效 0：无效
    private Date regdttm;//登记日期
    private Integer id;//主键
    private Integer sId;//分类ID
    private String Name;//点检分类名称
    private Integer odr;//顺序
    private String remark;//备注

    @Override
    public String toString() {
        return "CSortItem{" +
                "delcd=" + delcd +
                ", regdttm=" + regdttm +
                ", id=" + id +
                ", sId=" + sId +
                ", Name='" + Name + '\'' +
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

    public Date getRegdttm() {
        return regdttm;
    }

    public void setRegdttm(Date regdttm) {
        this.regdttm = regdttm;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getOdr() {
        return odr;
    }

    public void setOdr(Integer odr) {
        this.odr = odr;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
