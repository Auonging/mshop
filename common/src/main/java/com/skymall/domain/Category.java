package com.skymall.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhaogengren
 * @since 2019-03-06
 */

@Data
@Component
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("nideshop_category")
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    private String keywords;

    private String frontDesc;

        /**
     * 父类型
     */
         private Integer parentId;

    private Boolean sortOrder;

    private Boolean showIndex;

    private Boolean isShow;

    private String bannerUrl;

    private String iconUrl;

    private String imgUrl;

    private String wapBannerUrl;

    private String level;

    private Integer type;

    private String frontName;

//    /**
//     * 分页
//     */
//    private Integer page;
//
//    private Integer size;


}
