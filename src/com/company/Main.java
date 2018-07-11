package com.company;

import com.company.clases.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Abstracta> lista = Arrays.asList(new Abstracta[]{new Test(), new NuevoTest()});
        /*
        Abstracta ab1 = new Test();
        Abstracta ab2 = new NuevoTest();
        List<Abstracta> lista = new ArrayList<>();
        lista.add(ab1);
        lista.add(ab2);
        */

        for (Abstracta abstracta : lista) {
            abstracta.testAbstracto();
        }

        TestInterface testInterface = new TestInterface();
        String n = testInterface.nombreCompleto("gustavo", "gamboa");

        TestNuevaInterface testNuevaInterface = new TestNuevaInterface();
        String n2 = testNuevaInterface.nombreCompleto("gustavo", "gamboa");


        System.out.println(n);
        System.out.println(n2);

        List<InterfacePrueba> list = new ArrayList<>();
        list.add(testInterface);
        list.add(testNuevaInterface);

    }
}
