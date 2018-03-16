package com.check.mapper;

import com.check.model.CRegHisModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by C0034 on 2018/3/15.
 */
@Mapper
public interface CRegHisMapper {

    @Select("Select * From c_reg_his Where delcd = 1 Order By regdttm ")
    CRegHisModel findCRegHis();
}
