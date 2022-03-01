package com.dispensador.app;

import com.dispensador.dominio.Gaseosa;
import com.dispensador.dominio.DispensadorDeGaseosa;

public class AppDispensador {
    public static void main(String[] args0) {
        Gaseosa gaseosa = new Gaseosa("Coca cola");

        DispensadorDeGaseosa dispensador = new DispensadorDeGaseosa("UCO", 3);
        dispensador.gaseosa = gaseosa;

        dispensador.llenar();
        dispensador.servir(1);
        dispensador.servir(0.9);
        dispensador.servir(1.1);

        Gaseosa gaseosa2 = new Gaseosa("Pepsi");

        dispensador.cambiarGaseosa(gaseosa2);
        dispensador.servir(0.3);
    }|
}
