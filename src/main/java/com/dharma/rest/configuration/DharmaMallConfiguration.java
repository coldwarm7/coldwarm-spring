package com.dharma.rest.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Coldwarm on 18/5/16.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.dharma.rest")
public class DharmaMallConfiguration {

}
