package com.check.mapper;

import com.check.model.CSortModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by C0034 on 2018/3/15.
 */
@Mapper
public interface CSortMapper {

    @Select("select * from c_sort where delcd =1 order by odr")
    CSortModel findCSort();
}
