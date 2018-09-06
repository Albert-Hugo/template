package com.ido.zcsd.controller;

import com.ido.zcsd.controller.request.GetPostReq;
import com.rainful.domain.PageQuery;
import com.rainful.domain.ResponseDTO;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;

/**
 * @author ido
 * Date: 2018/4/24
 **/
@RestController
@RequestMapping("user")
public class UserController {

    @ApiOperation(value = "根据id查询学生的信息",notes = "查询数据库中某个学生的信息")
    @PostMapping("/posts")
    public ResponseDTO getMyPost(@RequestBody GetPostReq req){

        return ResponseDTO.success(null,"list my post");
    }

}
