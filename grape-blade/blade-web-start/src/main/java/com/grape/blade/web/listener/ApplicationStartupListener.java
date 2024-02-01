package com.grape.blade.web.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 监听事件
 *
 * @author : luoyiwei
 * @date : 2024-02-01 17:36
 */
@Slf4j
@Component
public class ApplicationStartupListener implements ApplicationListener<ApplicationReadyEvent> {

    @Async
    @Override
    public void onApplicationEvent(ApplicationReadyEvent env) {
        String protocol = "http";
        ConfigurableEnvironment environment = env.getApplicationContext().getEnvironment();
        if (environment.getProperty("server.ssl.key-store") != null) {
            protocol = "https";
        }
        String serverPort = environment.getProperty("local.server.port");
        String contextPath = environment.getProperty("server.servlet.context-path");
        if (contextPath == null || contextPath.isBlank()) {
            contextPath = "/";
        }
        String hostAddress = "localhost";
        try {
            hostAddress = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            log.warn("The host name could not be determined, using `localhost` as fallback");
        }
        log.info("\n----------------------------------------------------------\n\t" +
                        "Application '{}' is running! Access URLs:\n\t" +
                        "Local: \t\t{}://localhost:{}{}\n\t" +
                        "External: \t{}://{}:{}{}\n\t" +
                        "Profile(s): \t{}\n----------------------------------------------------------",
                environment.getProperty("spring.application.name"),
                protocol,
                serverPort,
                contextPath,
                protocol,
                hostAddress,
                serverPort,
                contextPath,
                environment.getActiveProfiles());
    }
}
