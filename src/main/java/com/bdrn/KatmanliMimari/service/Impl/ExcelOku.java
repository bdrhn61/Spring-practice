package com.bdrn.KatmanliMimari.service.Impl;

import com.bdrn.KatmanliMimari.service.Reader;
import org.springframework.stereotype.Component;

@Component
public class ExcelOku implements Reader {
    @Override
    public String read() {
        return "Excel okundu";
    }
}
