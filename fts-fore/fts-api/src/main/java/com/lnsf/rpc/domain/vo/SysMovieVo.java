package com.lnsf.rpc.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * 封装电影查询的条件
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SysMovieVo implements Serializable {

    private String movieNameCn;

    private String movieNameEn;

    private Long movieAreaId;

    private Long movieAgeId;

    private Long movieCategoryId;

    private Date startDate;

    private Date endDate;

}
