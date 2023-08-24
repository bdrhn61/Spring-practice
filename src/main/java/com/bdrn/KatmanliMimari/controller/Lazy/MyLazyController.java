package com.bdrn.KatmanliMimari.controller.Lazy;

import com.bdrn.KatmanliMimari.service.Lazy.MyLazyClassController;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api")
public class MyLazyController {
    MyLazyClassController myLazyClassController;

    MyLazyController(@Lazy MyLazyClassController myLazyClassController){
        this.myLazyClassController=myLazyClassController;
    }
    @GetMapping(path = "/lazy")
    public String getCName(){
        return myLazyClassController.getCName();
    }
}
