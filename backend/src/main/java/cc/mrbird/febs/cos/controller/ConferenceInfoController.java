package cc.mrbird.febs.cos.controller;


import cc.mrbird.febs.common.utils.R;
import cc.mrbird.febs.cos.entity.ConferenceInfo;
import cc.mrbird.febs.cos.service.IConferenceInfoService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    /**
     * 分页获取会议记录
     *
     * @param page           分页对象
     * @param conferenceInfo 会议记录
     * @return 结果
     */
    @GetMapping("/page")
    public R page(Page<ConferenceInfo> page, ConferenceInfo conferenceInfo) {
        return R.ok();
    }

    /**
     * 查询会议记录详情
     *
     * @param id 主键ID
     * @return 结果
     */
    @GetMapping("/{id}")
    public R detail(@PathVariable("id") Integer id) {
        return R.ok(conferenceInfoService.getById(id));
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
