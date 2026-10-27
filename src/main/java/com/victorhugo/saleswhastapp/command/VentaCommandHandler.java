package com.victorhugo.saleswhastapp.command;

import com.victorhugo.saleswhastapp.dto.VentaRegistradaResponseDTO;
import com.victorhugo.saleswhastapp.service.MessageService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

//Venta Command
@Component
public class VentaCommandHandler implements CommandHandler{

    private String comando = "venta";
    private String[] messageResponse = new String[4];



    @Override
    public String getCommand() {
        return comando;
    }

    @Override
    public String handle(List<String> arguments) {

        messageResponse[0] = arguments.get(0);
        messageResponse[1] = arguments.get(1);

        StringBuilder arg2 = new StringBuilder();
        for(int i = 2; i < arguments.size()-1 ; i++){
            arg2.append(arguments.get(i))
                .append(" ");
        }
        arg2.append(arguments.get(arguments.size()-2));
        messageResponse[2] = new String(arg2);

        messageResponse[3] =  arguments.get(arguments.size()-1);


        //Field tipo
        VentaRegistradaResponseDTO dto = new VentaRegistradaResponseDTO();
        dto.setTipo(messageResponse[0]);


        //Field quantity
        try {
            dto.setCantidad(Integer.parseInt(messageResponse[1]));

            if (dto.getCantidad() < 1) {
                return "Cantidad inválida: debe ser un número entero mayor que cero.";
            }

        } catch (NumberFormatException e) {
            return "Cantidad inválida: " + messageResponse[1]
                    + ". Ingresa un número entero.";
        }


        //Field Description
        dto.setDescription(new StringBuilder(messageResponse[2]));


        //Field price
        try {
            dto.setPrecio(Double.parseDouble(messageResponse[3]));

            if (dto.getPrecio() < 1) {
                return "Precio inválido: debe ser un número entero mayor que cero.";
            }

        } catch (NumberFormatException e) {
            return "Precio inválido: " + messageResponse[3]
                    + ". Ingresa un número entero.";
        }

        //Response
        return "#Venta registrada \n"
                + messageResponse[0] + "\n"
                + messageResponse[1] + "\n"
                + messageResponse[2] + "\n"
                + "$" +messageResponse[3];

    }
}
