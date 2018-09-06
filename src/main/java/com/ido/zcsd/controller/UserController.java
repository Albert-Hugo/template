package com.ido.zcsd.controller;

import com.rainful.domain.ResponseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ido
 * Date: 2018/4/24
 **/
@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("{userId}/posts")
    public ResponseDTO getMyPost(){
        return ResponseDTO.success(null,"list my post");
    }

}
