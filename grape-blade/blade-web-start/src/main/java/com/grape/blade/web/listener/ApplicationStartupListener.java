package com.grape.blade.web.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Optional;

/**
 * 监听事件
 *
 * @author : luoyiwei
 * @date : 2024-02-01 17:36
 */
@Slf4j
@Component
public class ApplicationStartupListener implements ApplicationListener<ApplicationReadyEvent> {


    @Override
    public void onApplicationEvent(ApplicationReadyEvent env) {
        ConfigurableEnvironment environment = env.getApplicationContext().getEnvironment();
        String protocol = getProtocol(environment);
        String serverPort = getServerPort(environment);
        String contextPath = getContextPath(environment);
        String hostAddress = getHostAddressWithFallback();
        String applicationName = environment.getProperty("spring.application.name");
        String[] activeProfiles = environment.getActiveProfiles();
        log.info(
                "\n----------------------------------------------------------\n\t" +
                "Application '{}' is running! Access URLs:\n\t" +
                "Local: \t\t{}://localhost:{}{}\n\t" +
                "External: \t{}://{}:{}{}\n\t" +
                "Profile(s): \t{}\n----------------------------------------------------------",
                applicationName, protocol, serverPort, contextPath, protocol, hostAddress,
                serverPort, contextPath, Arrays.asList(activeProfiles));

    }


    private String getProtocol(ConfigurableEnvironment environment) {
        return Optional.ofNullable(environment.getProperty("server.ssl.key-store")).map(ks -> "https").orElse("http");
    }

    private String getServerPort(ConfigurableEnvironment environment) {
        return Optional.ofNullable(environment.getProperty("server.port")).orElse("8080");
    }

    private String getContextPath(ConfigurableEnvironment environment) {
        return Optional.ofNullable(environment.getProperty("server.servlet.context-path")).filter(cp -> !cp.isBlank()).orElse("/");
    }

    private String getHostAddressWithFallback() {
        try {
            return InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            log.warn("The host name could not be determined, using `localhost` as fallback");
            return "localhost";
        }
    }
}
