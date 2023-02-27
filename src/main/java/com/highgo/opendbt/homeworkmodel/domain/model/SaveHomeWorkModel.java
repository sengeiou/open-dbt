package com.highgo.opendbt.homeworkmodel.domain.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.highgo.opendbt.exercise.domain.entity.TNewExercise;
import com.highgo.opendbt.homeworkmodel.domain.entity.TModelExercise;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * @Description: 保存作业模板实体类
 * @Title: ListHomeWorkModelVO
 * @Package com.highgo.opendbt.homeworkmodel.vo
 * @Author:
 * @Copyright 版权归HIGHGO企业所有
 * @CreateTime: 2022/9/6 9:48
 */
@Data
@ToString
@ApiModel(description = "保存作业模板实体类")
public class SaveHomeWorkModel  {
    /**
     *
     */
    private Integer id;

    /**
     * 课程id
     */
    @ApiModelProperty(value = "课程id",required=true)
    @NotNull(message = "课程id不能为空")
    private Integer courseId;

    /**
     * 父类id
     */
    @ApiModelProperty(value = "父类id",required=true)
    @NotNull(message = "父类id不能为空")
    private Integer parentId;

    /**
     * 0:试题，1:文件夹
     */
    @ApiModelProperty(value = "类型0:试题，1:文件夹")
    private Integer elementType;

    /**
     * 作业模板名称
     */
    @ApiModelProperty(value = "作业模板名称",required=true)
    @NotBlank(message = "作业模板名称不能为空")
    private String modelName;

    /**
     * 1:私有，2:共享
     */
    @ApiModelProperty(value = "1:私有，2:共享")
    private Integer authType;

    /**
     * 评分机制 1：百分制2：自定义
     */
    @ApiModelProperty(value = "评分机制 1：百分制2：自定义",required=true)
    @NotNull(message = "评分机制不能为空")
    private Integer grandingStandard;

    /**
     * 题型归类1：是2：否
     */
    @ApiModelProperty(value = "题型归类1：是2：否",required=true)
    @NotNull(message = "题型归类不能为空")
    private Integer classify;

    /**
     * 创建时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 创建人员
     */
    private Integer createUser;

    /**
     * 修改时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /**
     * 修改人员
     */
    private Integer updateUser;

    /**
     * 删除标志0：未删除1：已删除
     */
    private Short deleteFlag;

    /**
     * 删除时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date deleteTime;

    /**
     * 删除人员
     */
    private Integer deleteUser;

    /**
     * 模板习题关联
     */
    private List<TModelExercise> modelExercises;

    /**
     * 习题列表
     */
    private List<TNewExercise> exercises;
    /**
     * 总分
     */
    private Double tgp;
    /**
     *习题数量
     */
    private Integer totalExercise=0;
    /**
     *习题分类列表
     */
    private List<ModelExerciseModel> classifyExercises;
}
