package cc.mrbird.febs.cos.service;

import cc.mrbird.febs.cos.entity.AttendanceInfo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.LinkedHashMap;

/**
 * 考勤管理 service层
 *
 * @author FanK fan1ke2ke@gmail.com
 */
public interface IAttendanceInfoService extends IService<AttendanceInfo> {

    /**
     * 分页获取考勤打卡
     *
     * @param page      分页对象
     * @param attendanceInfo 考勤打卡
     * @return 结果
     */
    IPage<LinkedHashMap<String, Object>> queryAttendancePage(Page<AttendanceInfo> page, AttendanceInfo attendanceInfo);
}
