package com.onassignment.interactive.testapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LameRestController {

    @RequestMapping(value="/rest/test", method= RequestMethod.GET, produces="application/json")
    public Map<String, Object> testing() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "PJ");
        map.put("age", "52");
        map.put("java-skill", "1000000");

        return map;
    }

}
