package cc.mrbird.febs.cos.controller;


import cc.mrbird.febs.common.utils.R;
import cc.mrbird.febs.cos.entity.AgentInfo;
import cc.mrbird.febs.cos.service.IAgentInfoService;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * 代办任务 控制层
 *
 * @author FanK fan1ke2ke@gmail.com
 */
@RestController
@RequestMapping("/cos/agent-info")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AgentInfoController {

    private final IAgentInfoService agentInfoService;

    /**
     * 分页获取代办任务
     *
     * @param page      分页对象
     * @param agentInfo 代办任务
     * @return 结果
     */
    @GetMapping("/page")
    public R page(Page<AgentInfo> page, AgentInfo agentInfo) {
        return R.ok();
    }

    /**
     * 查询代办任务详情
     *
     * @param id 主键ID
     * @return 结果
     */
    @GetMapping("/{id}")
    public R detail(@PathVariable("id") Integer id) {
        return R.ok(agentInfoService.getById(id));
    }

    /**
     * 查询代办任务列表
     *
     * @return 结果
     */
    @GetMapping("/list")
    public R list() {
        return R.ok(agentInfoService.list());
    }

    /**
     * 新增代办任务
     *
     * @param agentInfo 代办任务
     * @return 结果
     */
    @PostMapping
    public R save(AgentInfo agentInfo) {
        agentInfo.setCreateDate(DateUtil.formatDateTime(new Date()));
        return R.ok(agentInfoService.save(agentInfo));
    }

    /**
     * 修改代办任务
     *
     * @param agentInfo 代办任务
     * @return 结果
     */
    @PutMapping
    public R edit(AgentInfo agentInfo) {
        return R.ok(agentInfoService.updateById(agentInfo));
    }

    /**
     * 删除代办任务
     *
     * @param ids ids
     * @return 代办任务
     */
    @DeleteMapping("/{ids}")
    public R deleteByIds(@PathVariable("ids") List<Integer> ids) {
        return R.ok(agentInfoService.removeByIds(ids));
    }
}
