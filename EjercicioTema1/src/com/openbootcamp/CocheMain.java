package com.openbootcamp;

public class CocheMain {
    public static void main(String[] args) {
        String coche = "alfa romeo";
        Coche cocheObj = new Coche();
        Coche cocheObj2 = new Coche("rojo", "honda", "civic", 1430.45, 5.4);

        //cocheObj2.acelerar(50);
        System.out.println(cocheObj2);

        cocheObj2.peso = 1350.8;
        System.out.println(cocheObj2);

        CocheElectrico cocheElectrico = new CocheElectrico();
        cocheElectrico.motorElectrico = "Ejemplo motor";
        cocheElectrico.color = "Verde";
        cocheElectrico.fabricante = "Honda";
        cocheElectrico.modelo = "civic";

        System.out.println(cocheElectrico);

        CocheElectrico cocheElectrico2 = new CocheElectrico("azul", "alfa", "romeo", 1500d,
                4.99, "TXZ");

        System.out.println(cocheElectrico2);

        cocheElectrico2.acelerar(50);

        System.out.println(cocheElectrico2);

    }
    public static void TeslaCar() {
        CocheElectrico AutoElectrico = new CocheElectrico();
        AutoElectrico.motorElectrico = "Ejemplo motor";
        AutoElectrico.color = "Verde";
        AutoElectrico.fabricante = "Honda";
        AutoElectrico.modelo = "civic";

        System.out.println(AutoElectrico);

        CocheElectrico AutoElectrico2 = new CocheElectrico("azul", "alfa", "romeo", 1500d,
                4.99, "TXZ");

        System.out.println(AutoElectrico2);

        AutoElectrico2.acelerar(50);

        System.out.println(AutoElectrico2);
    }
}