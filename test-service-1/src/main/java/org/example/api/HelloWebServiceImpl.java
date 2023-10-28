package org.example.api;

import com.demo.HelloWebService;
import io.micrometer.tracing.annotation.ContinueSpan;
import io.micrometer.tracing.annotation.NewSpan;

public class HelloWebServiceImpl implements HelloWebService {
    @Override
    public String hello(String name) {
        return "Hello, " + name;
    }
}
