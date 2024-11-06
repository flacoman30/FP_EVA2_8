/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_validad;

import java.util.Scanner;

/**
 *
 * @author flac3
 */
public class EVA2_8_VALIDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int dia;
        Scanner captu = new Scanner(System.in);
        do{
        System.out.println("numero correspondiente al dia (1-7)");
        dia = captu.nextInt();
        
        }while(dia< 1 || dia > 7);
        switch(dia){
            case 1:
                System.out.println("lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
            case 3:
                System.out.println("miercoles");
                break;
            case 4:
                System.out.println("jueves");
                break;
            case 5:
                System.out.println("viernes");
                break;        
            case 6:
                System.out.println("sabado");
                break;
            case 7:
                System.out.println("domingo");
                break;
        }
       
    
        
        
        
        
        
    }
    
}
