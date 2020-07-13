package com.vue.demo.config;

import io.github.yedaxia.apidocs.Docs;
import io.github.yedaxia.apidocs.DocsConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class ApiDocConfig {
    @Bean
    public DocsConfig docsConfig(){
        DocsConfig config = new DocsConfig();
        config.setProjectPath("F:/myOwn/Program/vue_learn/后端/vueservice"); // 项目根目录
        config.setProjectName("vueservice"); // 项目名称
        config.setApiVersion("V1.0");       // 声明该API的版本
        config.setDocsPath("/api"); // 生成API 文档所在目录
        config.setAutoGenerate(Boolean.FALSE);  // 配置自动生成
        Docs.buildHtmlDocs(config); // 执行生成文档
        return config;
    }


}
