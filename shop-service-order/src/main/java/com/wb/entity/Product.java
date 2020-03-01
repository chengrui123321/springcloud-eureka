package com.wb.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Auther: r.cheng
 * @Date: 2020/3/1 15:19
 * @Description:
 * @Version: 1.0
 */
@Data
public class Product {

    private Long id;
    private String productName;
    private Integer status;
    private BigDecimal price;
    private String productDesc;
    private String caption;
    private Integer inventory;

}