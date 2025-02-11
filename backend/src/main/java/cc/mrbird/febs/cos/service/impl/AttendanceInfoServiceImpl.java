package cc.mrbird.febs.cos.service.impl;

import cc.mrbird.febs.cos.entity.AttendanceInfo;
import cc.mrbird.febs.cos.dao.AttendanceInfoMapper;
import cc.mrbird.febs.cos.service.IAttendanceInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 考勤管理 实现层
 *
 * @author FanK fan1ke2ke@gmail.com
 */
@Service
public class AttendanceInfoServiceImpl extends ServiceImpl<AttendanceInfoMapper, AttendanceInfo> implements IAttendanceInfoService {

}
