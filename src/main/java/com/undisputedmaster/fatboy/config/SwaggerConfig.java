package com.undisputedmaster.fatboy.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.service.Parameter;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.schema.ModelRef;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Swapnil.Khandizod on 26-06-2018.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {



    @Bean
    public Docket api() {

        Parameter accessTokenParam = new ParameterBuilder()
                .name("Authorization")
                .description("Authentication Token")
                .modelRef(new ModelRef("string"))
                .parameterType("header")
                .build();



        List<Parameter> params = new ArrayList<Parameter>();
        params.add(accessTokenParam);

        return new Docket(DocumentationType.SWAGGER_2)
        		.globalOperationParameters(params)
                .apiInfo(apiInfo())
                .select()
                .apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot")))
                //.paths(PathSelectors.regex("/matrimony.*"))
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Matrimony API")
                .description("Controller reference for developers")
                .version("1.0").build();
    }
}
