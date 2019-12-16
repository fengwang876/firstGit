package com.wangfeng.bootbegin.model.yaml;

import com.wangfeng.bootbegin.config.MixPropertySourceFactory;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@Data
@Component
@Validated
@ConfigurationProperties(prefix = "family")
@PropertySource(value = {"classpath:family.yml"},factory = MixPropertySourceFactory.class)
public class Family {
    //@Value("${family.family-name}")
    private String familyName;

    private Father father;

    private Mother mother;

    private Child child;
}
