package org.example.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class TracingConfig {
    /*@Value("spring.application.name")
    private String serviceName;
    @Bean
    public Tracing tracing() {
        ThreadLocalCurrentTraceContext currentTraceContext = ThreadLocalCurrentTraceContext.newBuilder()
                .addScopeDecorator(MDCScopeDecorator.get()).build();
        AsyncZipkinSpanHandler spanHandler = AsyncZipkinSpanHandler.newBuilder(sender).build();
        return Tracing.newBuilder().localServiceName(serviceName).addSpanHandler(spanHandler).currentTraceContext(currentTraceContext).build();
    }*/
}
