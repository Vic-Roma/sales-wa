package com.victorhugo.saleswhastapp.command;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.tags.ArgumentAware;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Uses a Hashmap to find the right command
@Component
public class CommandRouter {

    private Map<String,CommandHandler> handlers;

    //Uses DI to fill the map
    public CommandRouter(List<CommandHandler> commandHandlers){
        Map<String,CommandHandler> handlers = new HashMap<>();

        for(CommandHandler c:commandHandlers){
            handlers.put(c.getCommand(),c);
        }

        this.handlers = handlers;

    }

    public String route(ParsedCommandDTO dto){

        if(!handlers.containsKey(dto.getCommand())){
            return "Instruccion no reconocida";
        }
        return handlers.get(dto.getCommand()).handle(dto.getArguments());

    }
}
