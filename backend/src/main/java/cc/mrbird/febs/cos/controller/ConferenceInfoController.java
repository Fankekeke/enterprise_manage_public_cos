package cc.mrbird.febs.cos.controller;


import cc.mrbird.febs.common.utils.R;
import cc.mrbird.febs.cos.entity.ConferenceInfo;
import cc.mrbird.febs.cos.entity.StaffInfo;
import cc.mrbird.febs.cos.service.IConferenceInfoService;
import cc.mrbird.febs.cos.service.INotifyInfoService;
import cc.mrbird.febs.cos.service.IStaffInfoService;
import cn.hutool.core.collection.CollectionUtil;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * 会议记录 控制层
 *
 * @author FanK fan1ke2ke@gmail.com
 */
@RestController
@RequestMapping("/cos/conference-info")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ConferenceInfoController {

    private final IConferenceInfoService conferenceInfoService;

    private final IStaffInfoService staffInfoService;

    private final INotifyInfoService notifyInfoService;

    /**
     * 分页获取会议记录
     *
     * @param page           分页对象
     * @param conferenceInfo 会议记录
     * @return 结果
     */
    @GetMapping("/page")
    public R page(Page<ConferenceInfo> page, ConferenceInfo conferenceInfo) {
        return R.ok(conferenceInfoService.queryConferencePage(page, conferenceInfo));
    }

    /**
     * 查询会议记录详情
     *
     * @param id 主键ID
     * @return 结果
     */
    @GetMapping("/{id}")
    public R detail(@PathVariable("id") Integer id) {
        return R.ok(conferenceInfoService.queryDetail(id));
    }

    /**
     * 查询会议记录列表
     *
     * @return 结果
     */
    @GetMapping("/list")
    public R list() {
        return R.ok(conferenceInfoService.list());
    }

    /**
     * 新增会议记录
     *
     * @param conferenceInfo 会议记录
     * @return 结果
     */
    @PostMapping
    public R save(ConferenceInfo conferenceInfo) {
        StaffInfo staffInfo = staffInfoService.getOne(Wrappers.<StaffInfo>lambdaQuery().eq(StaffInfo::getUserId, conferenceInfo.getStaffId()));
        if (staffInfo != null) {
            conferenceInfo.setStaffId(staffInfo.getId());
        }
        List<String> staffIds = Arrays.asList(conferenceInfo.getStaffIds().split(","));
        if (CollectionUtil.isNotEmpty(staffIds)) {
            for (String staffId : staffIds) {
                // 添加通知
                notifyInfoService.addNotify(Integer.parseInt(staffId), "您好，“"+conferenceInfo.getTitle()+"”" + ", 会议在" + conferenceInfo.getStartTime() + "开始，请及时参与会议。");
            }
        }
        return R.ok(conferenceInfoService.save(conferenceInfo));
    }

    /**
     * 修改会议记录
     *
     * @param conferenceInfo 会议记录
     * @return 结果
     */
    @PutMapping
    public R edit(ConferenceInfo conferenceInfo) {
        return R.ok(conferenceInfoService.updateById(conferenceInfo));
    }

    /**
     * 删除会议记录
     *
     * @param ids ids
     * @return 会议记录
     */
    @DeleteMapping("/{ids}")
    public R deleteByIds(@PathVariable("ids") List<Integer> ids) {
        return R.ok(conferenceInfoService.removeByIds(ids));
    }
}
