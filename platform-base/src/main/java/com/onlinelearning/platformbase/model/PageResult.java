package com.onlinelearning.platformbase.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @description 分页查询结果模型类
 * @author Mr.M
 * @date 2022/9/6 14:15
 * @version 1.0
 */
@Data
@ToString
public class PageResult<T> implements Serializable {

    // 数据列表
    @ApiModelProperty(value = "数据列表")
    private List<T> items;

    //总记录数
    @ApiModelProperty(value = "总记录数",example = "1000")
    private long counts;

    //当前页码
    @ApiModelProperty(value = "当前页码",example = "1")
    private long page;

    //每页记录数
    @ApiModelProperty(value = "每页记录数",example = "10")
    private long pageSize;

    public PageResult(List<T> items, long counts, long page, long pageSize) {
        this.items = items;
        this.counts = counts;
        this.page = page;
        this.pageSize = pageSize;
    }



}
