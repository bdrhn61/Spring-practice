package com.bdrn.Anotation.ScopeAnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class FirstScopeController {

    @Autowired
    private MyComponentScope myComponentScope;

    @GetMapping(path = "/first-scope-controller")
    private String getNameofComponent(){
        return  this.myComponentScope.getName();
    }
}
