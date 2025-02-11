package cc.mrbird.febs.cos.controller;


import cc.mrbird.febs.common.utils.R;
import cc.mrbird.febs.cos.entity.FinanceInfo;
import cc.mrbird.febs.cos.service.IFinanceInfoService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 财务申请 控制层
 *
 * @author FanK fan1ke2ke@gmail.com
 */
@RestController
@RequestMapping("/cos/finance-info")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class FinanceInfoController {

    private final IFinanceInfoService financeInfoService;

    /**
     * 分页获取财务申请
     *
     * @param page        分页对象
     * @param financeInfo 财务申请
     * @return 结果
     */
    @GetMapping("/page")
    public R page(Page<FinanceInfo> page, FinanceInfo financeInfo) {
        return R.ok();
    }

    /**
     * 查询财务申请详情
     *
     * @param id 主键ID
     * @return 结果
     */
    @GetMapping("/{id}")
    public R detail(@PathVariable("id") Integer id) {
        return R.ok(financeInfoService.getById(id));
    }

    /**
     * 查询财务申请列表
     *
     * @return 结果
     */
    @GetMapping("/list")
    public R list() {
        return R.ok(financeInfoService.list());
    }

    /**
     * 新增财务申请
     *
     * @param financeInfo 财务申请
     * @return 结果
     */
    @PostMapping
    public R save(FinanceInfo financeInfo) {
        return R.ok(financeInfoService.save(financeInfo));
    }

    /**
     * 修改财务申请
     *
     * @param financeInfo 财务申请
     * @return 结果
     */
    @PutMapping
    public R edit(FinanceInfo financeInfo) {
        return R.ok(financeInfoService.updateById(financeInfo));
    }

    /**
     * 删除财务申请
     *
     * @param ids ids
     * @return 财务申请
     */
    @DeleteMapping("/{ids}")
    public R deleteByIds(@PathVariable("ids") List<Integer> ids) {
        return R.ok(financeInfoService.removeByIds(ids));
    }
}
