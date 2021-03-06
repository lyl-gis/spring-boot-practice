package edu.zju.gis.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanlong_lee@qq.com
 * @version 1.0 2019/04/07
 */
@RefreshScope
@RestController
public class TestController {
    @Value("from")
    private String from;

    @GetMapping("/from")
    public String from() {
        return from;
    }
}
