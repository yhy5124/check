package com.check;

import com.check.mapper.CSortMapper;
import com.check.model.CSortModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by C0034 on 2018/3/14.
 */
@Controller
public class HomeContoller {

    @Autowired
    private CSortMapper cSortMapper;

    @RequestMapping("/index.html")
    @ResponseBody
    public CSortModel say(){
        return cSortMapper.findCSort();
//        return null;
    }
}
