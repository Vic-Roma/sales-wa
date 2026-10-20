package com.victorhugo.saleswhastapp.command;

import java.util.List;

public class ParsedCommandDTO {


    private String command;
    private List<String> arguments;

    public ParsedCommandDTO(){}

    public ParsedCommandDTO(String command, List<String> arguments){
        this.arguments =   arguments;
        this.command= command;
    }
    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public List<String> getArguments() {
        return arguments;
    }

    public void setArguments(List<String> arguments) {
        this.arguments = arguments;
    }
}
