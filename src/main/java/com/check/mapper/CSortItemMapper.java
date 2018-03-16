package com.check.mapper;

import com.check.model.CSortItemModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by C0034 on 2018/3/15.
 */
@Mapper
public interface CSortItemMapper {

    @Select("Select * From c_sort_item Where delcd = 1 Order By odr")
    CSortItemModel findCSortItem();

}
