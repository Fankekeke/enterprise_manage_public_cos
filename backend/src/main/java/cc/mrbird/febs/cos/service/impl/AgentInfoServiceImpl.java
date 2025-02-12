package cc.mrbird.febs.cos.service.impl;

import cc.mrbird.febs.cos.entity.AgentInfo;
import cc.mrbird.febs.cos.dao.AgentInfoMapper;
import cc.mrbird.febs.cos.service.IAgentInfoService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;

/**
 * 代办任务 实现层
 *
 * @author FanK fan1ke2ke@gmail.com
 */
@Service
public class AgentInfoServiceImpl extends ServiceImpl<AgentInfoMapper, AgentInfo> implements IAgentInfoService {

    /**
     * 分页获取代办任务
     *
     * @param page      分页对象
     * @param agentInfo 代办任务
     * @return 结果
     */
    @Override
    public IPage<LinkedHashMap<String, Object>> queryAgentPage(Page<AgentInfo> page, AgentInfo agentInfo) {
        return baseMapper.queryAgentPage(page, agentInfo);
    }
}
