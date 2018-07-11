package com.company.clases;

import java.util.List;

public class TestInterface implements InterfacePrueba {
    @Override
    public String nombreCompleto(String name, String apellido) {
        return apellido + ", " + name;
    }

    @Override
    public double calcularEdadMedia(List<Integer> edades) {
        return 0;
    }

    @Override
    public void test(String palabra) {
        System.out.println("La palabra recibida no vale para nada");
    }
}
