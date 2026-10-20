package com.victorhugo.saleswhastapp.command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommandFactory {

    List<CommandHandler> handlers = new ArrayList<>();

    Map<String,CommandHandler> enrutador = new HashMap<>();

    public void fabricaDeComandos(String message){

        CommandHandler ventaCommand = new VentaCommandHandler();

        enrutador.put(ventaCommand.getCommand(), ventaCommand);



    }

}
