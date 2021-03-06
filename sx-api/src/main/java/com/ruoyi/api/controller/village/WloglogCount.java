package com.ruoyi.api.controller.village;

import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import com.ruoyi.village.domain.Wloglog;
import com.ruoyi.village.service.IWloglogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Wloglog")
@CrossOrigin
@Api(value = "村民上网网页访问类型统计-- 统计计数类接口")
public class WloglogCount {
    @Autowired
    private IWloglogService wloglogService;

    @CrossOrigin
    @GetMapping("/logname")
    @ApiOperation(value = "村民上网网页访问类型统计")
    public RongApiRes list()
    {
        return RongApiService.get_list(wloglogService.selectWloglogBylogname());
    }
}
