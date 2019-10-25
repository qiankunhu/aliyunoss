package com.hqk.hqkservice.controller;

import com.hqk.hqkservice.util.AliyunOssUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/sys")
public class UploadController {

    @Autowired
    private AliyunOssUtil aliyunOssUtil;

    @RequestMapping(value = "uploadFile",method = RequestMethod.POST)
    public String uploadBlog( @RequestParam(value = "file") MultipartFile file){

        try {

            aliyunOssUtil.checkImage(file);


        }catch (Exception ex){
            ex.printStackTrace();
        }
        return "ok";
    }

}
