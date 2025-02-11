package cc.mrbird.febs.cos.controller;


import cc.mrbird.febs.common.utils.R;
import cc.mrbird.febs.cos.entity.AttendanceInfo;
import cc.mrbird.febs.cos.service.IAttendanceInfoService;
import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * 考勤管理 控制层
 *
 * @author FanK fan1ke2ke@gmail.com
 */
@RestController
@RequestMapping("/cos/attendance-info")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AttendanceInfoController {

    private final IAttendanceInfoService attendanceInfoService;

    /**
     * 分页获取考勤打卡
     *
     * @param page      分页对象
     * @param attendanceInfo 考勤打卡
     * @return 结果
     */
    @GetMapping("/page")
    public R page(Page<AttendanceInfo> page, AttendanceInfo attendanceInfo) {
        return R.ok();
    }

    /**
     * 查询考勤打卡详情
     *
     * @param id 主键ID
     * @return 结果
     */
    @GetMapping("/{id}")
    public R detail(@PathVariable("id") Integer id) {
        return R.ok(attendanceInfoService.getById(id));
    }

    /**
     * 查询考勤打卡列表
     *
     * @return 结果
     */
    @GetMapping("/list")
    public R list() {
        return R.ok(attendanceInfoService.list());
    }

    /**
     * 新增考勤打卡
     *
     * @param attendanceInfo 考勤打卡
     * @return 结果
     */
    @PostMapping
    public R save(AttendanceInfo attendanceInfo) {
        return R.ok(attendanceInfoService.save(attendanceInfo));
    }

    /**
     * 修改考勤打卡
     *
     * @param attendanceInfo 考勤打卡
     * @return 结果
     */
    @PutMapping
    public R edit(AttendanceInfo attendanceInfo) {
        return R.ok(attendanceInfoService.updateById(attendanceInfo));
    }

    /**
     * 删除考勤打卡
     *
     * @param ids ids
     * @return 考勤打卡
     */
    @DeleteMapping("/{ids}")
    public R deleteByIds(@PathVariable("ids") List<Integer> ids) {
        return R.ok(attendanceInfoService.removeByIds(ids));
    }
}
