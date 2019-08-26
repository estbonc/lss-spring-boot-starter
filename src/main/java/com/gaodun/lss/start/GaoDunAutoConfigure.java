package com.gaodun.lss.start;

import com.gaodun.lss.properties.LssProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liushuaishuai
 * @date 2019/8/26 13:27
 */
@Configuration
@ConditionalOnClass(PersonService.class)
@EnableConfigurationProperties({LssProperties.class})
@Slf4j
public class GaoDunAutoConfigure {

    @Autowired
    private LssProperties lssProperties;

    @Bean
    @ConditionalOnMissingBean
    public PersonService person() {
        log.info("Init person");
        return new PersonService(lssProperties);
    }

}
