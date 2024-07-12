package org.undetermined.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 订单
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    // 订单号
    private String number;

    // 下单用户id
    private Long userId;

    // 收货人
    private String consignee;

    // 手机号
    private String phone;

    // 地址
    private String address;

    // 下单时间
    private LocalDateTime orderTime;
}
