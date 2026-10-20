package com.victorhugo.saleswhastapp.controller;

import com.victorhugo.saleswhastapp.service.MessageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {

    private final MessageService messageService;

    public MessageController( MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping
    public String receiveMessage(@RequestBody String message) {
       return messageService.process(message);
    }
}
