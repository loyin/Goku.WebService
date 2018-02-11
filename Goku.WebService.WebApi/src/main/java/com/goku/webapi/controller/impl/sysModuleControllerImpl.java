package com.goku.webapi.controller.impl;

import com.goku.webapi.controller.sysModuleController;
import com.goku.webapi.handler.sysModuleHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nbfujx on 2018/2/11.
 */
@RestController
@RequestMapping("sysModule")
public class sysModuleControllerImpl implements sysModuleController {

    @Autowired
    sysModuleHandle sysmodulehandle;

    @Override
    @RequestMapping("/getModuleForPaging")
    public String getModuleForPaging() {
        return sysmodulehandle.getModuleForPaging();
    }
}
