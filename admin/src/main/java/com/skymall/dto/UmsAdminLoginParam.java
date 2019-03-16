package com.skymall.dto;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
@Data
public class UmsAdminLoginParam {
    private String username;
    private String password;

}
