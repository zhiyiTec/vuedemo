package com.vue.demo.test;

import io.github.yedaxia.apidocs.Docs;
import io.github.yedaxia.apidocs.DocsConfig;

public class Test {
    public static void main(String[] args) {
        DocsConfig config = new DocsConfig();
        config.setProjectPath("F:\\myOwn\\Program\\vue_learn\\后端\\vueservice"); // root project path
        config.setProjectName("vueservice"); // project name
        config.setApiVersion("V1.0");       // api version
        config.setDocsPath("C:\\Users\\Administrator\\Desktop\\api\\V1.0"); // api docs target path
        config.setAutoGenerate(Boolean.TRUE);  // auto generate
        Docs.buildHtmlDocs(config); // execute to generate
    }
}
