package com.example.service.impl;

import com.example.entity.User;
import com.example.service.ActionService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ActionServiceImpl implements ActionService {
    @Override
    public List<User> getInfo() {
        Map<String,Object> map = new HashMap<>();
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            char name = (char) ((char) 97 + i);
            users.add(new User(i + 1 + "", name + "", i + 20+""));
        }
        map.put("info", users);
        return users;
    }
}
