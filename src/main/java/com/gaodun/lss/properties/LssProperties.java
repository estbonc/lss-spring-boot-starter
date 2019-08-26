package com.gaodun.lss.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author liushuaishuai
 * @date 2019/8/26 13:29
 */
@ConfigurationProperties("spring.person")
public class LssProperties {

    private String name;

    private Integer age;

    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
