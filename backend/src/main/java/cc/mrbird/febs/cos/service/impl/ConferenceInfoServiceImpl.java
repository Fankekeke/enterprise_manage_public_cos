package cc.mrbird.febs.cos.service.impl;

import cc.mrbird.febs.cos.entity.ConferenceInfo;
import cc.mrbird.febs.cos.dao.ConferenceInfoMapper;
import cc.mrbird.febs.cos.service.IConferenceInfoService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;

/**
 * 会议记录 实现层
 *
 * @author FanK fan1ke2ke@gmail.com
 */
@Service
public class ConferenceInfoServiceImpl extends ServiceImpl<ConferenceInfoMapper, ConferenceInfo> implements IConferenceInfoService {

    /**
     * 分页获取会议记录
     *
     * @param page           分页对象
     * @param conferenceInfo 会议记录
     * @return 结果
     */
    @Override
    public IPage<LinkedHashMap<String, Object>> queryConferencePage(Page<ConferenceInfo> page, ConferenceInfo conferenceInfo) {
        return baseMapper.queryConferencePage(page,conferenceInfo);
    }
}
