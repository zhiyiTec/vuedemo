package com.vue.demo.controller;

import com.vue.demo.config.ApiDocConfig;
import com.vue.demo.po.FilePo;
import com.vue.demo.po.UserPo;
import com.vue.demo.util.FileUtils;
import io.github.yedaxia.apidocs.ApiDoc;
import io.github.yedaxia.apidocs.Docs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {
    @Autowired
    ApiDocConfig apiDocConfig;
    @ResponseBody
    @RequestMapping("/test")
    public String test(){
        return "cs";
    }

    /**
     * 保存用户
     * @param userPo
     */
    @ApiDoc(result = UserPo.class)
    @PostMapping(path = "/apiTest")
    @ResponseBody
    public Map<String,Object> apiTest(@RequestBody UserPo userPo){
        Map<String,Object>map=new HashMap<>();
        map.put("user",userPo);
        return map;
    }

    /**
     *
     * @api {get} /v3.1/ues/:sn/rt-info 获取设备上报实时信息
     * @apiVersion 3.1.0
     * @apiName GetUeRealTimeInfo
     * @apiGroup UE
     *
     * @apiHeader {String} Authorization 用户授权token
     * @apiHeader {String} firm 厂商编码
     * @apiHeaderExample {json} Header-Example:
     *     {
     *       "Authorization": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOjM2NzgsImF1ZGllbmNlIjoid2ViIiwib3BlbkFJZCI6MTM2NywiY3JlYXRlZCI6MTUzMzg3OTM2ODA0Nywicm9sZXMiOiJVU0VSIiwiZXhwIjoxNTM0NDg0MTY4fQ.Gl5L-NpuwhjuPXFuhPax8ak5c64skjDTCBC64N_QdKQ2VT-zZeceuzXB9TqaYJuhkwNYEhrV3pUx1zhMWG7Org",
     *       "firm": "cnE="
     *     }
     *
     * @apiParam {String} sn 设备序列号
     *
     * @apiSuccess {String} sn 设备序列号
     * @apiSuccess {Number} status 设备状态
     * @apiSuccess {Number} soc 电池电量百分比
     * @apiSuccess {Number} voltage 电池电压
     * @apiSuccess {Number} current 电池电流
     * @apiSuccess {Number} temperature 电池温度
     * @apiSuccess {String} reportTime 上报时间(yyyy-MM-dd HH:mm:ss)
     *
     * @apiSuccessExample Success-Response:
     *     HTTP/1.1 200 OK
     *     {
     *       "sn": "P000000000",
     *       "status": 0,
     *       "soc": 80,
     *       "voltage": 60.0,
     *       "current": 10.0,
     *       "temperature": null,
     *       "reportTime": "2018-08-13 18:11:00"
     *     }
     *
     * @apiUse RkNotFoundException
     *
     */
    @RequestMapping(path = "/api/v1/admin/login", method = RequestMethod.POST)
    @ResponseBody
    public String login(@RequestParam(value = "name") String name){
            return name;
    }


    /**
     * 保存用户
     * @param
     */
    @PostMapping(path = "/upload")
    @ResponseBody
    public Map<String,Object> upload(FilePo filePo, HttpServletResponse response, HttpServletRequest request){
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Credentials", "true");// 允许服务器向浏览器跨域响应时更改浏览器（客户端）的cookie
        Map<String,Object>map=new HashMap<>();
        if(filePo.getFiles()!=null){
            for (MultipartFile file:filePo.getFiles()){
                FileUtils.MultipartFile2File(file);
            }

        }

        map.put("result",200);
        return map;
    }

}
