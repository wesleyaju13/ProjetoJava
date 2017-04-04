/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows 7
 */
public class Piso implements Serializable {
    
    private ArrayList<String> pisos;
    
   public void storePiso(String floor){
        pisos.add(floor);
    }
    
   
    public int numberOfPisos(){
        return pisos.size();
    }
    
    
    public void listPisos(){
        int index = 0;
		while(index < pisos.size()){
			System.out.println(pisos.get(index));
			index++;
		}

    }
    
    
    public void pegarTXT(){
        String line = "C:"+File.separator+"Users"+File.separator+"Windows 7"+File.separator+"Documents"+File.separator+"NetBeansProjects"+File.separator+"ProjetoFinal"+File.separator+"mapa.txt"; // aqui é o caminho do arquivo
        File arquivo = new File(line);
        pisos = new ArrayList<String>();
            try {
                BufferedReader reader = new BufferedReader(new FileReader(arquivo));
                String dados = null;
                while (reader.ready()) {
                    dados = reader.readLine(); // aqui eu pego linha a linha do txt
                    pisos.add(dados); // aqui eu armazeno a linha do txt em um List
                }
                reader.close();
        
    }            
     catch(FileNotFoundException e) {
   System.out.println("o arquivo específico não pode ser localizado"); 
    }
    catch(IOException e) {
   System.out.println("algo saiu errado com a leitura ou fechamento"); 
    } 

    } 
    
   public String[] getPiso(int index){
        
        String valor = pisos.get(index);
        String[] pisos = valor.split("\\,", -1);
        
        return pisos;
   } 
      
  
    public void removePisos(int pisoNumber){
        if(pisoNumber < 0) {
            // This is not a valid note number, so do nothing.
        }
        else if(pisoNumber < numberOfPisos()) {
            // This is a valid note number.
            pisos.remove(pisoNumber);
        }
        else {
            // This is not a valid note number, so do nothing.
        }
    }
    
}