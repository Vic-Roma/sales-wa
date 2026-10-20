package com.victorhugo.saleswhastapp.command;

import java.util.List;

//contract that every command have to had
public interface CommandHandler {

    String getCommand();
    String handle(List<String> arguments);
}
