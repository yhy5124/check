package com.check.model;

import java.util.Date;

/**
 * Created by C0034 on 2018/3/15.
 */
public class CRegHisModel {
    private Integer delcd;//数据是否有效 1：有效 0：无效
    private Date regdttm;//登记日期
    private Integer id;//主键
    private Date chkDt;//点检日期
    private String stfName;//点检员工姓名
    private String detail;//点检项明细：[{si_id:点检项, si_name:点检项名称,status:true(正常)|false(不正常),remark : 备注信息,pics : [图片1，图片2，图片3，图片4，图片5]}
    private String remark;//备注

    @Override
    public String toString() {
        return "CRegHis{" +
                "delcd=" + delcd +
                ", regdttm=" + regdttm +
                ", id=" + id +
                ", chkDt=" + chkDt +
                ", stfName='" + stfName + '\'' +
                ", detail='" + detail + '\'' +
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

    public Date getChkDt() {
        return chkDt;
    }

    public void setChkDt(Date chkDt) {
        this.chkDt = chkDt;
    }

    public String getStfName() {
        return stfName;
    }

    public void setStfName(String stfName) {
        this.stfName = stfName;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
