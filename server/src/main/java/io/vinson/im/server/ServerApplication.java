package io.vinson.im.server;

import io.vinson.im.server.websocket.WebSocketServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: jiangweixin
 * @date: 2019/4/17
 */
@EnableEurekaClient
@SpringBootApplication
public class ServerApplication implements CommandLineRunner {

    private static Logger logger = LoggerFactory.getLogger(ServerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.warn("server application startup，url: http://127.0.0.1:8080/");
        WebSocketServer.start();
    }
}
