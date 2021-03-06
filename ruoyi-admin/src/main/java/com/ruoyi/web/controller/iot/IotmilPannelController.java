package com.ruoyi.web.controller.iot;

import com.ruoyi.broad.domain.BroadCount;
import com.ruoyi.broad.service.IBcountService;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.iot.domain.RiverData;
import com.ruoyi.iot.service.IRiverDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author xss
 * @Description:TODO
 * @ClassName IotmilPannelController
 * @date 2019/3/27 15:49
 **/
@Controller
@RequestMapping("/iot/milpannel")
public class IotmilPannelController extends BaseController{
    private String prefix = "iot/milpannel";
    @Autowired
    private IRiverDataService RiverDataService;
    @GetMapping()
    public String milpannel() {
        return prefix + "/milpannel";
    }
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list() {
        startPage();
        List<RiverData> list = RiverDataService.select();
        return getDataTable(list);
    }
}

