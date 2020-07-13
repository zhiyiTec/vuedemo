package com.vue.demo.po;

import org.springframework.web.multipart.MultipartFile;

public class FilePo {
    private MultipartFile []files;

    public MultipartFile[] getFiles() {
        return files;
    }

    public void setFiles(MultipartFile[] files) {
        this.files = files;
    }
}
