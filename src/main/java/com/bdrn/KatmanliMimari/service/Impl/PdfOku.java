package com.bdrn.KatmanliMimari.service.Impl;

import com.bdrn.KatmanliMimari.service.Reader;
import org.springframework.stereotype.Component;

@Component("PDF")
public class PdfOku implements Reader {
    @Override
    public String read() {
        return "pdf okundu";
    }
}
