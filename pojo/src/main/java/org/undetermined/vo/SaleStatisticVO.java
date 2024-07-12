package org.undetermined.vo;

import java.io.Serializable;

/**
 * @author Joey
 * @version 1.0
 * 销售额统计，返回对象所属类
 */
public class SaleStatisticVO implements Serializable {
    // 总销售额
    private Integer totalSaleCount;

    // 有效销售额
    private Integer validSaleCount;
}
