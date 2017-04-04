/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

import java.util.ArrayList;

/**
 *
 * @author Windows 7
 */
public class Mapa {
    
    private int[ ][ ][ ] array_dimensoes;
    private Piso pisos;
    
    public Mapa(int largura, int altura, int profundidade){ // PASSO OS PARAMETROS PARA O CONSTRUTOR, QUEM INSTANCIAR A CLASSE MAPA TEM QUE DIZER A ALTURA, LARGURA E PROFUNDIDADE
        pisos = new Piso(); // INSTANCIO O OBJETO DA CLASSE PISOS()
        pisos.pegarTXT(); // USO A FUNCAO PRA PEGAR AS INFORMACOES DO ARQUIVO E SALVAR NO ARRAYLIST DO OBJETO
        int[][][] array_dimensoes = new int[largura][altura][profundidade]; // INICIO O ARRAY COM A LARGURA, ALTURA E PROFUNDIDADE PASSADAS
        for (int i=0; i <= profundidade; i++;) {
            for (int l=0; l <= altura; l++) {
                for (int j=0; j <= largura; j++) {
                    array_dimensoes[j][l][i] = pisos.pisoAleatorio(); // GERO UM NUMERO ALEATORIO DE PISOS PARA CADA SQM DO MAPA
                }
            }
        }
    }
    
}
