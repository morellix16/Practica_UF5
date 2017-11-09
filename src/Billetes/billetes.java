/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Billetes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Albert
 */
public class billetes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
        FileReader fwEntrada = new FileReader ("billets.txt");
        
        BufferedReader brEntrada = new BufferedReader (fwEntrada);
        
        String [] falsos = {};
        String billets = brEntrada.readLine();
        boolean sospechoso=false;
        while(billets != null){
           for(int i = 0; i < billets.length()-4; i++){
               if(billets.charAt(i) == '0' && billets.charAt(i+1) == '0' && billets.charAt(i+2) == '0'){
                   
               }else{
                   if(billets.charAt(i) != '0' && billets.charAt(i+1) != '0' && billets.charAt(i+2) != '0' && billets.charAt(i+3) != '0'){
                    
                   }
               }
           }
           billets = brEntrada.readLine();
        }
        
        for(int i = 0; i < falsos.length; i++){
            System.out.println(falsos[i]);
        }
    }
    
}
