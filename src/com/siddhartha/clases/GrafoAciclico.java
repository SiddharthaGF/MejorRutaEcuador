package com.siddhartha.clases;

public class GrafoAciclico {

    private final int[][] mAdyacencia;

    public GrafoAciclico(int pNodos) {
        mAdyacencia = new int[pNodos][pNodos];
    }

    public void AdicionarArista(int pNodoInicio, int pNodoFinal, int pPeso) {
        mAdyacencia[pNodoInicio][pNodoFinal] = pPeso;
        mAdyacencia[pNodoFinal][pNodoInicio] = pPeso;
    }

    public int ObtenerAdyacencia(int pFila, int pColumna) {
        return mAdyacencia[pFila][pColumna];
    }

}
