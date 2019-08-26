package com.gaodun.lss.start;

import com.gaodun.lss.properties.LssProperties;

/**
 * @author liushuaishuai
 * @date 2019/8/26 13:34
 */
public class PersonService {

    private LssProperties properties;

    public PersonService() {
    }

    public PersonService(LssProperties properties) {
        this.properties = properties;
    }

    public String sayHello() {
        return "大家好，我叫: " + properties.getName() + ", 今年" + properties.getAge() + "岁"
                + ", 性别: " + properties.getSex();
    }
}
