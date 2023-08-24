package com.bdrn.KatmanliMimari.config;

import com.bdrn.KatmanliMimari.service.Lazy.ExampleBean;
import com.bdrn.KatmanliMimari.service.Lazy.ExampleBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@Lazy
public class MyConfiguration {

   public MyConfiguration (){
       System.out.println("MyConfiguration başlatıldı");
    }
    @Bean
    @Lazy
    public ExampleBean getExample(){
       return new ExampleBean();
    }
    @Bean
    public ExampleBean2 getExapmle2(){
       return new ExampleBean2();
    }
}
