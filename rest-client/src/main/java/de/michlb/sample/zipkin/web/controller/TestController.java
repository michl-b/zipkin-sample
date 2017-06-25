package de.michlb.sample.zipkin.web.controller;

import de.michlb.sample.zipkin.feign.ServiceOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by michael on 25.06.17.
 */
@RestController
public class TestController {

    @Autowired
    private ServiceOperations serviceOperations;

    @RequestMapping("/")
    public String ping(HttpServletRequest request) {
        serviceOperations.ping();
        return "pinged clients";
    }
}
