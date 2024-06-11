package org.example;

import java.io.*;
import java.util.ArrayList;

public class Main {
    private static String fileName = "testCase3.txt";
    private static long elementos = 1000000;

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> temp;
        //escribir();
        temp = leer();
        int [] canthilos = {1,2,4,8,16,32,64,128,256,512};

    }
    public static ArrayList<ArrayList<Integer>> dividirArrayList(ArrayList<Integer> lista, int numero) {
        ArrayList<ArrayList<Integer>> resultado = new ArrayList<>();
        int tamanoSublista = (int) Math.ceil((double) lista.size() / numero);
        int indice = 0;
        for (int i = 0; i < numero; i++) {
            ArrayList<Integer> sublista = new ArrayList<>();
            for (int j = indice; j < Math.min(indice + tamanoSublista, lista.size()); j++) {
                sublista.add(lista.get(j));
            }
            resultado.add(sublista);
            indice += tamanoSublista;
        }

        return resultado;
    }


    public static void escribir() throws IOException {
        StringBuilder str = new StringBuilder();
        for(long i =0; i<elementos; i++){
            str.append(((int) (Math.random() * 10000)+1)).append("\n");
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(str.toString());
        writer.close();
    }


    public static ArrayList<Integer> leer() throws IOException{
        ArrayList<Integer> resultado = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new BufferedReader(new FileReader(fileName)));
        while (reader.readLine() != null){
            resultado.add(Integer.parseInt( reader.readLine()));
        }
        reader.close();
        return resultado;
    }
}