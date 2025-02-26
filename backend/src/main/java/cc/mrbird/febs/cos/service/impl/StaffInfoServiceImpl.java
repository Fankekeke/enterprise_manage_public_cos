package cc.mrbird.febs.cos.service.impl;

import cc.mrbird.febs.cos.entity.StaffInfo;
import cc.mrbird.febs.cos.dao.StaffInfoMapper;
import cc.mrbird.febs.cos.service.IStaffInfoService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author FanK
 */
@Service
public class StaffInfoServiceImpl extends ServiceImpl<StaffInfoMapper, StaffInfo> implements IStaffInfoService {

    /**
     * 分页获取员工信息
     *
     * @param page          分页对象
     * @param staffInfo 员工信息
     * @return 结果
     */
    @Override
    public IPage<LinkedHashMap<String, Object>> selectStaffPage(Page<StaffInfo> page, StaffInfo staffInfo) {
        return baseMapper.selectStaffPage(page, staffInfo);
    }

    /**
     * 查询员工信息
     *
     * @param enterpriseId 企业id
     * @return 结果
     */
    @Override
    public List<LinkedHashMap<String, Object>> selectStaffList(Integer enterpriseId) {
        return baseMapper.selectStaffList(enterpriseId);
    }

    /**
     * 查询员工信息
     *
     * @param ids ids
     * @return 结果
     */
    @Override
    public List<LinkedHashMap<String, Object>> selectStaffListByUserIds(List<String> ids) {
        return baseMapper.selectStaffListByUserIds(ids);
    }
}
