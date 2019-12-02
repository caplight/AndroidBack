package com.caplight.android.controller;


import com.caplight.android.AndroidApplication;
import com.caplight.android.tool.WinterTool;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.annotation.security.RunAs;

@RestController
@RequestMapping("/winter")
public class WinterController {

    @RequestMapping("/getWinter")
    public String getWinter(){
        WinterTool winterTool=new WinterTool();
        return winterTool.getWinter();
    }
}
