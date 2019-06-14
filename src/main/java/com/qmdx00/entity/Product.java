package com.qmdx00.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author yuanweimin
 * @date 19/06/10 16:10
 * @description 产品实体
 */
@Entity
@Table(name = "t_product")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable {
    // 产品编号
    @Id
    private String productId;
    // 产品类型
    private String type;
    // 出产日期
    private Date createTime;
    // 生产工人编号
    private String workerId;
}