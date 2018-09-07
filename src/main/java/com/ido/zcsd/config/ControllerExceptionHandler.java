package com.ido.zcsd.config;

import com.ido.zcsd.exception.CustomException;
import com.rainful.domain.ResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


/**
 * 异常返回格式 {code:1000,msg:参数不正确}
 *
 * @author liliang
 * @description:
 * @datetime 18/2/1 下午1:09
 */
@ControllerAdvice
@Slf4j
public class ControllerExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public ResponseDTO handlerServiceOpException(RuntimeException ex) {
        return ResponseDTO.fail(null,ex.getMessage());
    }


    @ExceptionHandler(CustomException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public ResponseDTO handlerCustompException(CustomException ex) {
        ResponseDTO responseDTO = ResponseDTO.fail(null,ex.getMessage());
        responseDTO.setCode(ex.getCode());
        return responseDTO;
    }



}
