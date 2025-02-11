package cc.mrbird.febs.cos.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 考勤管理
 *
 * @author FanK fan1ke2ke@gmail.com
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class AttendanceInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 所属员工
     */
    private Integer staffId;

    /**
     * 上班打卡时间
     */
    private LocalDateTime putTakeDate;

    /**
     * 下班打卡时间
     */
    private LocalDateTime outTakeDate;


}
