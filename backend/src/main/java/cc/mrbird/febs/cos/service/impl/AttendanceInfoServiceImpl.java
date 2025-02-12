package cc.mrbird.febs.cos.service.impl;

import cc.mrbird.febs.cos.entity.AttendanceInfo;
import cc.mrbird.febs.cos.dao.AttendanceInfoMapper;
import cc.mrbird.febs.cos.service.IAttendanceInfoService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;

/**
 * 考勤管理 实现层
 *
 * @author FanK fan1ke2ke@gmail.com
 */
@Service
public class AttendanceInfoServiceImpl extends ServiceImpl<AttendanceInfoMapper, AttendanceInfo> implements IAttendanceInfoService {

    /**
     * 分页获取考勤打卡
     *
     * @param page      分页对象
     * @param attendanceInfo 考勤打卡
     * @return 结果
     */
    @Override
    public IPage<LinkedHashMap<String, Object>> queryAttendancePage(Page<AttendanceInfo> page, AttendanceInfo attendanceInfo) {
        return baseMapper.queryAttendancePage(page, attendanceInfo);
    }
}
