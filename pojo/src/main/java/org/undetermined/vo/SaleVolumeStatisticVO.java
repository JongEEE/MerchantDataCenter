package org.undetermined.vo;

import java.io.Serializable;

/**
 * @author Joey
 * @version 1.0
 * 销量统计，返回对象所属类
 */
public class SaleVolumeStatisticVO implements Serializable {
    // 销量总数
    private Integer totalSaleVolumeCount;

    // 有效销量
    private Integer validSaleVolumeCount;

}
