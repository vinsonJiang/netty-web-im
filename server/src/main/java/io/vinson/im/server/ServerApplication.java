package io.vinson.im.server;

import io.vinson.im.server.websocket.WebSocketServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: jiangweixin
 * @date: 2019/4/17
 */
@SpringBootApplication
public class ServerApplication implements CommandLineRunner {

    private static Logger logger = LoggerFactory.getLogger(ServerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
        logger.info("application started on 8080");
    }

    @Override
    public void run(String... args) throws Exception {
        WebSocketServer.start();
    }
}
