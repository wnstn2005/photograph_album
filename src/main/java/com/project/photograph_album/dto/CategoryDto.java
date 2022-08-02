package com.project.photograph_album.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class CategoryDto {

    private Integer cateKey;
    private String cateName;
    private String userId;
    private Timestamp createTime;
    private Integer delFlag;

}
