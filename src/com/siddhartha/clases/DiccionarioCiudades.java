package com.siddhartha.clases;

import java.util.*;
import java.util.List;

public class DiccionarioCiudades {

    private final int cantNodos = 23;
    private final Map<String, Integer> Diccionario = new HashMap<String, Integer>();

    private GrafoAciclico grafo;
    private double[][] tabla;
    private final List<Integer> ruta = new ArrayList<Integer>();

    public DiccionarioCiudades() {
        tabla = new double[cantNodos][cantNodos];
        LLenarDiccionario();
    }

    private void FijarTabla()
    {
        for (int i = 0; i < cantNodos; i++)
        {
            tabla[i][0] = 0;
            tabla[i][1] = Integer.MAX_VALUE;
            tabla[i][2] = 0;
        }
    }

    private void LLenarDiccionario() {
        Diccionario.put("Esmeraldas", 0);
        Diccionario.put("Portoviejo", 1);
        Diccionario.put("Santa Elena", 2);
        Diccionario.put("Guayaquil", 3);
        Diccionario.put("Babahoyo", 4);
        Diccionario.put("Santo Domingo", 5);
        Diccionario.put("Quito", 6);
        Diccionario.put("Ibarra", 7);
        Diccionario.put("Tulcán", 8);
        Diccionario.put("Nueva Loja", 9);
        Diccionario.put("Coca", 10);
        Diccionario.put("Tena", 11);
        Diccionario.put("Puyo", 12);
        Diccionario.put("Ambato", 13);
        Diccionario.put("Latacunga", 14);
        Diccionario.put("Guaranda", 15);
        Diccionario.put("Riobamba", 16);
        Diccionario.put("Azogues", 17);
        Diccionario.put("Cuenca", 18);
        Diccionario.put("Machala", 19);
        Diccionario.put("Loja", 20);
        Diccionario.put("Zamora", 21);
        Diccionario.put("Macas", 22);
        grafo = new GrafoAciclico(Diccionario.size());
        //Esmeraldas
        grafo.AdicionarArista(0, 1, 362); //Distancia Esmeralas - Portoviejo
        grafo.AdicionarArista(0, 5, 180); //Distancia Esmeralas - Santo Domingo
        grafo.AdicionarArista(0, 6, 317); //Distancia Esmeralas - Quito
        grafo.AdicionarArista(0, 7, 296); //Distancia Esmeralas - Ibarra
        grafo.AdicionarArista(0, 8, 372); //Distancia Esmeralas - Tulcan
        //Portoviejo
        grafo.AdicionarArista(1, 2, 211); //Distancia Manabi - Santa Elena
        grafo.AdicionarArista(1, 3, 192); //Distancia Manabi - Guayaquil
        grafo.AdicionarArista(1, 5, 228); //Distancia Manabi - Santo Domingo
        //Santa Elena
        grafo.AdicionarArista(2, 3, 128); //Distancia Santa Elena - Guayaquil
        //Guayaquil
        grafo.AdicionarArista(3, 4, 71.5); //Distancia Guayaquil - Babahoyo
        grafo.AdicionarArista(3, 15, 171); //Distancia Guayaquil - Guaranda
        grafo.AdicionarArista(3, 16, 230); //Distancia Guayaquil - Riobamba
        //grafo.AdicionarArista(3, 17, 209); //Distancia Guayaquil - Azuay
        grafo.AdicionarArista(3, 18, 197); //Distancia Guayaquil - Cuenca
        grafo.AdicionarArista(3, 19, 184); //Distancia Guayaquil - Machala
        //Babahoyo
        grafo.AdicionarArista(4, 5, 211); //Distancia Babahoyo - Santo Domingo
        grafo.AdicionarArista(4, 15, 101); //Distancia Babahoyo - Guaranda
        //Santo Domingo
        //grafo.AdicionarArista(5, 4, 211); //Distancia Babahoyo - Santo Domingo
        grafo.AdicionarArista(5, 6, 150); //Distancia Santo Domingo - Quito
        //Quito
        grafo.AdicionarArista(6, 7, 113); //Distancia Quito - Ibarra
        grafo.AdicionarArista(6, 9, 401); //Distancia Quito - Nueva Loja
        grafo.AdicionarArista(6, 11, 194); //Distancia Quito - Tena
        grafo.AdicionarArista(6, 14, 109); //Distancia Quito - Latacunga
        //Ibarra
        grafo.AdicionarArista(7, 8, 126); //Distancia Ibarra - Tulcan
        grafo.AdicionarArista(7, 9, 317); //Distancia Ibarra - Nueva Loja
        //Tulcan
        grafo.AdicionarArista(8, 9, 236); //Distancia Tulcan - Nueva Loja
        //Nueva Loja
        //grafo.AdicionarArista(9, 11, 251); //Distancia Nueva Loja - Tena
        grafo.AdicionarArista(9, 10, 82); //Distancia Nueva Loja - Coca
        //Coca
        grafo.AdicionarArista(10, 11, 174); //Distancia Coca - Tena
        //Tena
        grafo.AdicionarArista(11, 12, 77.8); //Distancia Tena - Puyo
        grafo.AdicionarArista(11, 14, 79.5); //Distancia Tena - Latacunga
        //Puyo
        grafo.AdicionarArista(12, 13, 99.8); //Distancia Puyo - Ambato
        grafo.AdicionarArista(12, 22, 135); //Distancia Puyo - Macas
        //Ambato
        grafo.AdicionarArista(13, 14, 41.5); //Distancia Ambato - Latacunga
        grafo.AdicionarArista(13, 15, 95); //Distancia Ambato - Guaranda
        grafo.AdicionarArista(13, 16, 56.4); //Distancia Ambato - Riobamba
        grafo.AdicionarArista(13, 22, 227); //Distancia Ambato - Macas
        //Guaranda
        grafo.AdicionarArista(15, 16, 56.1); //Distancia Guaranda - Riobamba
        //Riobamba
        grafo.AdicionarArista(16, 17, 231); //Distancia Riobamba - Azogues
        //grafo.AdicionarArista(16, 21, 476); //Distancia Riobamba - Zamora
        grafo.AdicionarArista(16, 22, 157); //Distancia Riobamba - Macas
        //Azogues
        grafo.AdicionarArista(17, 18, 32.2); //Distancia Azogues - Cuenca
        grafo.AdicionarArista(17, 22, 213); //Distancia Azogues - Macas
        //Cuenca
        grafo.AdicionarArista(18, 19, 168); //Distancia Cuenca - Machala
        grafo.AdicionarArista(18, 20, 213); //Distancia Cuenca - Loja
        grafo.AdicionarArista(18, 22, 222); //Distancia Cuenca - Macas
        //Machala
        grafo.AdicionarArista(19, 20, 236); //Distancia Machala - Loja
        //Loja
        grafo.AdicionarArista(20, 21, 64.3); //Distancia Loja - Zamora
        //Zamora
        grafo.AdicionarArista(21, 22, 319); //Distancia Zamora - Macas
    }

    private void CalcularRuta(int inicio, int fin) {
        ruta.clear();
        tabla[inicio][1] = 0;
        int actual = inicio;
        do
        {
            tabla[actual][0] = 1;
            for (int columna = 0; columna < cantNodos; columna++)
            {
                if (grafo.ObtenerAdyacencia(actual, columna) != 0) {
                    double distancia = grafo.ObtenerAdyacencia(actual, columna) + tabla[actual][1];
                    if (distancia < tabla[columna][1]) {
                        tabla[columna][1] = distancia;
                        tabla[columna][2] = actual;

                    }
                }
            }
            int indiceMenor = -1;
            double distanciaMenor = Integer.MAX_VALUE;
            for (int i = 0; i < cantNodos; i++)
            {
                if (tabla[i][1] < distanciaMenor && tabla[i][0] == 0)
                {
                    indiceMenor = i;
                    distanciaMenor = tabla[i][1];
                }
            }
            actual = indiceMenor;
        } while (actual != -1);
        int nodo = fin;
        while (nodo != inicio)
        {
            ruta.add(nodo);
            nodo = (int) tabla[nodo][2];
        }
        ruta.add(inicio);
        Collections.reverse(ruta);
        for(int posicion:ruta)
        {
            String key = ObtenerClaveDicionario(posicion);
        }
    }

    public String Calcular(String inicio, String fin)
    {
        FijarTabla();
        CalcularRuta(Diccionario.get(inicio), Diccionario.get(fin));
        double distancia = tabla[Diccionario.get(fin)][1];
        return ("Distancia: " + Math.round(distancia * 100.0) / 100.0 + " km");
    }

    public String Recorrido()
    {
        StringBuilder lista = new StringBuilder();
        int i = 1;
        for(int ciudad:ruta)
        {
            lista.append(i).append(".- ").append(ObtenerClaveDicionario(ciudad)).append("\n");
            i++;
        }
        return lista.toString();
    }

    private String ObtenerClaveDicionario(int valor) {
        for (Map.Entry<String, Integer> entry : Diccionario.entrySet())
            if (valor == entry.getValue()) return entry.getKey();
        return "";
    }

}
