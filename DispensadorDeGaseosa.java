package com.dispensador.dominio;

public class DispensadorDeGaseosa {
    public String marca;
    public double capacidad;
    public double cantidadActual;
    public Gaseosa gaseosa;

    public DispensadorDeGaseosa(String marca, double capacidad) {
        this.marca = marca;
        this.capacidad = capacidad;
    }

    public boolean servir(double cantidadAServir) {
        if (cantidadAServir <= this.cantidadActual) {
            this.cantidadActual -= cantidadAServir;
            System.out.println("Se sirvió bien...");
            System.out.println("Queda " + this.cantidadActual + " de gaseosa " + this.gaseosa.marca);
            return true;
        }

        System.out.println("No se pudo servir.");
        return false;
    }

    public void cambiarGaseosa(Gaseosa nuevaGaseosa) {
        this.vaciar();
        this.gaseosa = nuevaGaseosa;
        this.llenar();
    }

    public void llenar() {
        this.cantidadActual = this.capacidad;
        System.out.println("El dispensador se llenó con " + this.gaseosa.marca);
    }

    public void vaciar() {
        this.cantidadActual = 0;
        System.out.println("El dispensador se vació con exito.");
    }
}
