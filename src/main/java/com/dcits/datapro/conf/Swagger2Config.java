package com.dcits.datapro.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {
//        http://localhost:8080/swagger-ui.html
//        http://localhost:8080/doc.html

    // 配置swagger2核心配置 docket
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)  // 指定api类型为swagger2
                    .apiInfo(apiInfo())                 // 用于定义api文档汇总信息
                    .select()
                .apis(RequestHandlerSelectors
                        .basePackage("com.dcits.datapro.web"))   // 指定controller包
                .paths(PathSelectors.any())         // 所有controller
                    .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("后台接口api")   // 文档页标题
                .contact(new Contact("GAGE",
                "https://ckq246765.github.io",
                "gagekeqi@gmail.com"))        // 联系人信息
                .description("后台api文档")  // 详细信息
                .version("1.0.1")   // 文档版本号
                .termsOfServiceUrl("http://localhost:8080/datapro") // 网站地址
                .build();
    }
}
