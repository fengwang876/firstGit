package com.wangfeng.bootbegin.model.yaml;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class Friend {
    @NotEmpty

    private String hobby;

    private String sex;
}
