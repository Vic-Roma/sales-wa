package com.victorhugo.saleswhastapp.controller;

import com.victorhugo.saleswhastapp.command.CommandParser;
import com.victorhugo.saleswhastapp.command.CommandRouter;
import com.victorhugo.saleswhastapp.command.ParsedCommandDTO;
import com.victorhugo.saleswhastapp.service.MessageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {

    private final CommandParser commandParser;
    private CommandRouter commandRouter;

    private final MessageService messageService;

    public MessageController(CommandParser commandParser, CommandRouter commandRouter, MessageService messageService) {
        this.commandParser = commandParser;
        this.commandRouter = commandRouter;


        this.messageService = messageService;
    }

    @PostMapping
    public String receiveMessage(@RequestBody String message) {
       return messageService.process(message);
    }
}
