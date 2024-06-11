package org.example;

import java.util.ArrayList;

public class SumaHilos implements Runnable{
    private ArrayList<Integer> data;
    private long total;

    public  SumaHilos(ArrayList<Integer> data) {
        this.data = data;
        this.total = 0;
    }

    @Override
    public void run() {
        for (int valor: data) {
            total += valor;
        }
    }

    public long getTotal() {
        return total;
    }
}
