package com.vue.demo.controller;

import com.vue.demo.po.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 用户接口
 * @author yeguozhong
 */
@RequestMapping("/api/user/")
@RestController
public class UserController {


    /**
     * 用户列表
     * @param listForm
     * @author yedaxia
     */
    @RequestMapping(path = "list", method = {RequestMethod.GET,  RequestMethod.POST}  )
    public ApiResult<PageResult<UserVO>> list(UserListForm listForm){
        ApiResult apiResult=new ApiResult();
        apiResult.setCode(200);
        return apiResult;
    }

    /**
     * 用户信息
     * @param userId 用户id
     * @author 周杰伦
     */
    @GetMapping("user-info/{userId}")
    public ApiResult<UserVO> userInfo(@PathVariable Long userId){
        return null;
    }

    /**
     * 保存用户
     * @param req
     * @param userForm
     * @return
     */
    @PostMapping(path = "save")
    public ApiResult<UserVO> saveUser(HttpServletResponse req, @RequestBody UserForm userForm){
        return null;
    }

    /**
     * 删除用户
     * @param userId 用户ID
     */
    @PostMapping("delete")
    public ApiResult deleteUser(@RequestParam Long userId){
        return null;
    }

    public ApiResult hello(){
        return null;
    }
}
