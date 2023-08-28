package com.bdrn.Anotation.ScopeAnotation;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import java.time.LocalDateTime;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)  // bir nesne oluşturulur ve iki class ta da injecttion işlemi yapılır. !! bir tane nesne üretilir iki class için
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // iki nesne oluşturulur ve herbiri farklı claslara inject edildi
//@RequestScope // her http isteği için yeni bir nesne oluşturur
@SessionScope // her bir http sessionu için bir scope oluşturur
public class MyComponentScope {
    public MyComponentScope(){
        System.out.println("My component scope initialized  "+ LocalDateTime.now());
    }

    String getName(){
        return "MyComponentScope";
    }
}
