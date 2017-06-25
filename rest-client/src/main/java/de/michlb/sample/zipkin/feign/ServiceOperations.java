package de.michlb.sample.zipkin.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by michael on 25.06.17.
 */
@FeignClient(value = "rest-service")
public interface ServiceOperations {

    @RequestMapping(value = "/api/test/ping", method = RequestMethod.GET)
    String ping();
}
