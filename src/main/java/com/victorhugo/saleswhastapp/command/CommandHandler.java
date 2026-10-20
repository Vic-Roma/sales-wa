package com.victorhugo.saleswhastapp.command;

import java.util.List;

public interface CommandHandler {

    String getCommand();
    String handle(List<String> arguments);
}
