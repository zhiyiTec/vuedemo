package com.vue.demo.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.Date;

public class FileUtils {
    private   Logger logger= LoggerFactory.getLogger(this.getClass());
    /**
     * MultipartFile 转 File
     * @param file
     * @return
     */
    public static File MultipartFile2File(MultipartFile file){
        File re=null;
        try {
            String fileName=new Date().getTime()+file.getOriginalFilename();
            String filePath="C:\\Users\\Administrator\\Desktop\\csscscweewe\\";
            File newFile = new File(filePath+fileName);
            file.transferTo(newFile);
            re=newFile;
        }catch (Exception e){
            e.printStackTrace();
        }
        return re;
    }

}
