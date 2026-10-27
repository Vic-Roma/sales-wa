package com.victorhugo.saleswhastapp.command;

import com.victorhugo.saleswhastapp.dto.ParsedCommandDTO;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

//Translates message into commands and arguments
@Component
public class CommandParser {

    public ParsedCommandDTO parse(String message){

        String[] parts = message.trim().split("\\s+");

        String command = parts[0];
        command = command.toLowerCase();

        List<String> arguments = Arrays.asList(
                Arrays.copyOfRange(parts, 1, parts.length)
        );

        return new ParsedCommandDTO(command, arguments);
    }

}
