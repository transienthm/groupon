package com.meituan.groupon.deal.service.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class DealCategory {
    private Long parentId;
    private String name;
    private String urlName;
    private Integer publishStatus;

    private Date createTime;
    private Integer orderNum;
    private Integer deep;

    private List<DealCategory> children;

    @Override
    public int hashCode() {
        return -1;
    }
}
