package com.bdrn.KatmanliMimari.controller.InjectionController;

import com.bdrn.KatmanliMimari.service.InjectionYontemleri.ConstractorInjection;
import com.bdrn.KatmanliMimari.service.InjectionYontemleri.FieldInjection;
import com.bdrn.KatmanliMimari.service.InjectionYontemleri.SetterInjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/inj")
public class InjectionController {

    @Autowired
    FieldInjection fieldInjection;

    SetterInjection setterInjection;
    ConstractorInjection constractorInjection;

    public InjectionController(ConstractorInjection constractorInjection) {
        this.constractorInjection = constractorInjection;
    }

    @GetMapping(path = "/field")
    public String getField(){
        return fieldInjection.getField();
    }
    @Autowired
    public void setSetterInjection(SetterInjection setterInjection) {
        this.setterInjection = setterInjection;
    }

    @GetMapping(path = "/getter")
    public String getSetter(){
        return setterInjection.getSetter();
    }
    @GetMapping(path = "/constructure")
    public String getConst(){
        return constractorInjection.constractInjetion();
    }
}
