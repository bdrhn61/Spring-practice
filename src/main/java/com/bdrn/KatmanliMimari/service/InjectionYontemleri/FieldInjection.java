package com.bdrn.KatmanliMimari.service.InjectionYontemleri;

import org.springframework.stereotype.Component;

@Component
public class FieldInjection {
    public String getField(){
        return "Field injection";
    }
}
