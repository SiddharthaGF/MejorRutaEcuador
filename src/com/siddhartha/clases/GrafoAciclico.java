package com.siddhartha.clases;

public class GrafoAciclico {

    private final double[][] mAdyacencia;

    public GrafoAciclico(int pNodos) {
        mAdyacencia = new double[pNodos][pNodos];
    }

    public void AdicionarArista(int pNodoInicio, int pNodoFinal, double pPeso) {
        mAdyacencia[pNodoInicio][pNodoFinal] = pPeso;
        mAdyacencia[pNodoFinal][pNodoInicio] = pPeso;
    }

    public double ObtenerAdyacencia(int pFila, int pColumna) {
        return mAdyacencia[pFila][pColumna];
    }

}
