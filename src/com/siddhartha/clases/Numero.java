package com.siddhartha.clases;

public class Numero {

    public static String ToTime(float n)
    {
        int dias = 0;
        String linea = "";
        if (n > 1440)
        {
            dias = (int) n / 1440;
            n %= 1440;
        }
        int horas = (int)n / 60;
        float minutos = n % 60;
        if (dias > 0)
        {
            linea += String.valueOf(dias) + " d";
            if (horas > 0 && minutos == 0) linea += " y ";
            else if (horas > 0 && minutos > 0) linea += ", ";
        }
        if (horas > 0)
        {
            linea += String.valueOf(horas) + " hr";
            if (minutos > 0) linea += " y ";
        }
        if (minutos > 0)
        {
            minutos = (int)(minutos * 0.6f);
            linea += String.valueOf(minutos) + " min";
        }
        return linea;
    }

}
