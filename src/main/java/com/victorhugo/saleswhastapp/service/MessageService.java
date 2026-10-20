package com.victorhugo.saleswhastapp.service;

import com.victorhugo.saleswhastapp.command.CommandParser;
import com.victorhugo.saleswhastapp.command.CommandRouter;
import com.victorhugo.saleswhastapp.command.ParsedCommandDTO;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private CommandParser commandParser;
    private CommandRouter commandRouter;


    public MessageService(CommandParser commandParser, CommandRouter commandRouter) {
        this.commandParser = commandParser;
        this.commandRouter = commandRouter;
    }



    public String process(String message){

        ParsedCommandDTO dto = commandParser.parse(message);

        return commandRouter.route(dto);
    }

    public CommandParser getCommandParser() {
        return commandParser;
    }

    public void setCommandParser(CommandParser commandParser) {
        this.commandParser = commandParser;
    }

    public CommandRouter getCommandRouter() {
        return commandRouter;
    }

    public void setCommandRouter(CommandRouter commandRouter) {
        this.commandRouter = commandRouter;
    }
}
