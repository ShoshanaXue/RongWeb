package com.ruoyi.web.controller.iot;

import com.ruoyi.broad.domain.BroadCount;
import com.ruoyi.broad.service.IBcountService;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.iot.domain.terminaltel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.iot.service.IterminaltelService;
import java.util.List;

/**
 * @author xss
 * @Description:TODO
 * @ClassName IotmetPlannelController
 * @date 2019/3/27 15:49
 **/
@Controller
@RequestMapping("/iot/metpannel")
public class IotmetPlannelController extends BaseController{
    private String prefix = "iot/metpannel";

    @Autowired
    private IterminaltelService terminaltelService;

    @GetMapping()
    public String pannel() {
        return prefix + "/metpannel";
    }

    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list() {
        startPage();
        List<terminaltel> list = terminaltelService.select();
        return getDataTable(list);
    }
}
