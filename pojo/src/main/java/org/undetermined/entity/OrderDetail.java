package org.undetermined.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 订单明细
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetail implements Serializable {

    /**
     * 订单状态 1发货中 2交易成功 3已取消 4退货
     */
    public static final Integer ON_DELIVERY = 1;
    public static final Integer COMPLETED = 2;
    public static final Integer CANCELLED = 3;
    public static final Integer RETURN = 4;

    private static final long serialVersionUID = 1L;

    private Long id;

    // 订单id
    private Long orderId;

    // 服装商品id
    private Long clothingId;

    // 数量
    private Integer quantity;

    // 总金额 = 商品单价 x 数量
    private BigDecimal totalAmount;

    //
    private Integer status;

    // 收到退货时间
    private LocalDateTime rcvretTime;
}
