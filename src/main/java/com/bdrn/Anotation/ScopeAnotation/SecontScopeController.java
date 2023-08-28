package com.bdrn.Anotation.ScopeAnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class SecontScopeController {

    @Autowired
    private MyComponentScope myComponentScope;
}
