package com.bdrn.Anotation.controller;

import com.bdrn.Anotation.model.Users;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api")
public class WebController {

       // @GetMapping(path = "/hello")
        @RequestMapping(path = "/hello",method = RequestMethod.GET)
        public String sayHello() {
            return "hello wolddddfff";
        }

        @PostMapping(path = "/save")
        public String save() {
            return "Kaydedildi";
        }
        @DeleteMapping(path = "/delete")
        public String delete() {
            return "Silindi";
        }
        @GetMapping({ "/message", "/message/{variable}"})
        public String pathVariable(@PathVariable(value = "variable",required = false) String message ) {
            return "Yoldan gelen mesaj "+message ;
        }
        //http://localhost:8080/api/reqParam?message=parametre buraya yazılacak
        @GetMapping(path = "/reqParam")
        public String reqParam(@RequestParam(required = false) String message ) {
            return "Yoldan gelen parametre "+message ;
        }
        @PostMapping(path = "/user")
        public Users user(@RequestBody Users user) {
            user.setPassword(" ");
            return user;
        }
        @PostMapping(path = "/users")
        public List<Users> users(@RequestBody List<Users> users) {
            users.forEach(user->user.setPassword(""));
            return users;
        }
        @GetMapping(path = "/header")
        public String getHeader(@RequestHeader ("my-header") String myHeaderr ){
            return "benim header"+ myHeaderr;
        }
}
