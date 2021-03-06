package com.microservices.limits.limitsservice;

import com.microservices.limits.bean.LimitConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {
    @GetMapping
    public LimitConfiguration retriveLimitsFromConfigurations()
    {
        return new LimitConfiguration(1000, 1);
    }
}
