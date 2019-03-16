package com.skymall.dto;

import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Data
public class UmsAdminParam {
    private String username;
    private String password;
    private String nickName;

}
