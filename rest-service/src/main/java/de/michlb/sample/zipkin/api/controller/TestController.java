package de.michlb.sample.zipkin.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by michael on 25.06.17.
 */
@RestController
@RequestMapping("api/test")
public class TestController {

    @RequestMapping("ping")
    public String ping(HttpServletRequest request) {
        return "ping received from: " + request.getRemoteAddr();
    }
}
