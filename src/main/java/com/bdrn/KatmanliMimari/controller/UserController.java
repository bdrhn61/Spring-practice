package com.bdrn.KatmanliMimari.controller;

import com.bdrn.KatmanliMimari.dto.User;
import com.bdrn.KatmanliMimari.service.Component.FirstClass;
import com.bdrn.KatmanliMimari.service.Component.SecontClass;
import com.bdrn.KatmanliMimari.service.IUserService;
import com.bdrn.KatmanliMimari.service.Reader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class UserController {

    @Autowired
    IUserService iUserService;
    @Autowired
    FirstClass firstClass;

    @Autowired
    SecontClass secontClass;

    @Autowired
    @Qualifier(value = "excelOku")
    private Reader reader;




    @GetMapping(path = "/users/{UserId}")
        public User getUserById(@PathVariable("UserId") int userId){
            return iUserService.getUserById(userId);
        }

    @GetMapping(path = "/first-class")
    public String getFirstClass(){
        return firstClass.getUserName();
         }
    @GetMapping(path = "/secont-class")
    public String getScontClass(){
        return secontClass.getUserName();
    }
    @GetMapping(path = "/excelOku")
    public String getExcel(){
        return reader.read();
    }
}

