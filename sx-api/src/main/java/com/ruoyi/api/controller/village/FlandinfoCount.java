package com.ruoyi.api.controller.village;

import com.ruoyi.village.domain.Flandinfo;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.village.service.IFlandinfoService;

import java.util.List;

/**
 * 林地信息 控制层
 *
 * @author 薛莎莎
 * @date 2019-12-18
 */

@RestController
@RequestMapping("/api/flandinfo")
@CrossOrigin
@Api(value = "林地信息")
public class FlandinfoCount{
    @Autowired
    public IFlandinfoService flandinfoService;

    @CrossOrigin
    @GetMapping("/list")
    @ApiOperation(value = "查询林地信息列表")
    public RongApiRes list(Flandinfo flandinfo)
    {
        return RongApiService.get_list(flandinfoService.selectFlandinfoList(flandinfo));
    }


    @CrossOrigin
    @GetMapping("/gtype")
    @ApiOperation(value = "根据分组对林地信息的统计")
    public RongApiRes selectFlandinfoGtype(){
        List pre=flandinfoService.selectFlandinfoGtype();
        RongApiRes test=RongApiService.get_list(pre);
        return test;
    }
}
