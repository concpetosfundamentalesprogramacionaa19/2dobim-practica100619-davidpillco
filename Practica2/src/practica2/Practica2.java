/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.io.File;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void leerRegistros() {
        try {
            Scanner entrada = new Scanner(new File("data/tabula.txt"));
            double promedio_goals = 0;
            double promedio_height = 0;
            double suma_goals = 0;
            double suma_height = 0;
            int contador = 0;
            
            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                // System.out.println(linea);
                ArrayList<String> linea_partes = new ArrayList<>(
                        Arrays.asList(linea.split("\\|")));
                
                suma_goals +=Double.parseDouble(linea_partes.get(11));
                suma_height +=Double.parseDouble(linea_partes.get(9));
                
                contador++;
            } // fin de while
            promedio_goals += suma_goals / contador;
            promedio_height += suma_height / contador;
            entrada.close();
            
            System.out.printf("El promedio de goals es: %.2f\n\n", promedio_goals);
            System.out.printf("El promedio de height es: %.2f", promedio_height);
        } catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
    }
}