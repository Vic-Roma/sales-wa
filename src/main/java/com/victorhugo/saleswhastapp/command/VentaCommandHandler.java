package com.victorhugo.saleswhastapp.command;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VentaCommandHandler implements CommandHandler{


    @Override
    public String getCommand() {
        return "venta";
    }

    @Override
    public String handle(List<String> arguments) {

        StringBuilder response = new StringBuilder();
        for(int i = 0 ; i< arguments.size() ; i++){
            response.append(arguments.get(i));
            response.append("\n");

        }
        return "#Venta registrada \n"
                + response;


    }
}
