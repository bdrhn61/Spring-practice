package com.bdrn.KatmanliMimari.service.Lazy;

import com.bdrn.KatmanliMimari.config.MyConfiguration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class MyLazyClassController {
    MyLazyClassController(ExampleBean exampleBean ,MyConfiguration myConfiguration){
        System.out.println("MyLazyClass initialized-------");
        this.exampleBean=exampleBean;
        this.myConfiguration=myConfiguration;

    }


    ExampleBean exampleBean;
    MyConfiguration myConfiguration;

    public String getCName(){
        return "MyLazyClassController";
    }

}
