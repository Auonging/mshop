package com.skymall.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhaogengren
 * @since 2019-03-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("nideshop_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private long id;

    private String username;

    private String password;

    private Boolean gender;

    private LocalDateTime birthday;

    private LocalDateTime registerTime;

    private LocalDateTime lastLoginTime;

    private String lastLoginIp;

    private Integer userLevelId;

    private String nickname;

    private String mobile;

    private String registerIp;

    private String avatar;

    private String weixinOpenid;

    private Integer status;


}
