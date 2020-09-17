package com.sumaojin.suzhenping.hrms.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author SMJ
 * @since 2020-09-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Account对象", description="")
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private Integer id;

    private String username;

    private String password;


}
