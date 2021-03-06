package com.ruoyi.broad.service;

import com.ruoyi.broad.domain.BroadTime;

import java.util.List;

/**
 * 根据时间和地区对广播数目的统计
 * @author 周博
 * @date 2019-01-15
 */
public interface IBroadTimeService {

    public List<com.ruoyi.broad.domain.BroadTime> selectList();

    public List<com.ruoyi.broad.domain.BroadTime> selectListByDate();

    public  List<BroadTime> selectListByScategory();
}
