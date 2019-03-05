/**
 * @Title: Swagger2
 * @ProjectName swagger2
 * @Description: TODO
 * @author 谢浩哲
 * @date 2019/3/420:31
 */

package com.zpark.swagger2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author 谢浩哲
 * @Configuration 表明这是一个配置类
 * @EnableSwagger2 开启Swagger2
 */
@Configuration
@EnableSwagger2
public class Swagger2 {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                // 指定扫描的包会生成文档
                .apis(RequestHandlerSelectors.basePackage("com.zpark.swagger2.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 配置一些基本信息
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot中使用Swagger2构建RESTful APIs")
                .description("swagger2入门教程，更多请关注http://www.gaozhy.cn")
                .termsOfServiceUrl("http://www.gaozhy.cn")
                .contact("gaozhy")
                .version("1.0")
                .build();
    }
}
