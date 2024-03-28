package com.nick.vuethymeleafdemo.webmvccontrollers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private static final Logger logger = LoggerFactory.getLogger(MessageController.class);

    @PostMapping("/print-message")
    public void printMessage(@RequestBody MessageRequest request) {
        String message = request.getMessage();
        logger.info("Current message: {}", message);
    }

    // 定义请求体的数据模型
    public static class MessageRequest {
        private String message;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}
