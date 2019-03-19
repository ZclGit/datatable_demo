package com.example.controller;

import com.example.entity.User;
import com.example.service.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("actionController")
public class ActionController {

    @Autowired
    private ActionService<User> actionService;

    @RequestMapping("getInfo")
    public Map<String,Object> getInfo(@RequestBody Map<String,Object> params) {

        params.clear();
        List<User> info = actionService.getInfo();
        params.put("info", info);
        return params;
    }
}
