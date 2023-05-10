package com.hollowambition.contenttrackerws.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/sample")
    public String getSampleResponse() {
        return "Sample response";
    }
}
