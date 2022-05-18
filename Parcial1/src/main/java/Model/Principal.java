/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Model;

import javax.swing.JOptionPane;

/**
 *
 * @author Sergio G
 */
public class Principal {

    public static void main(String[] args) {
        
        int cont = 0,con = 0,co = 0,c;

        CrearB B = new CrearB ();
        Sedes S = new Sedes ();
        TitularCuenta T = new TitularCuenta ();
        AperturaC A = new AperturaC ();
        
        int op = 0;
        Byte menu;
        do {
		menu =Byte.parseByte(JOptionPane.showInputDialog(" --------------------------------------\n"
				+ "  MENÚ:                                \n"
				+ " ------------------------------------- \n"
				+ "  1. Crear banco                       \n"
				+ "  2. Crear sedes bancarias             \n"
				+ "  3. Consultar sedes bancarias         \n"
				+ "  4. consultar cuenta                  \n"
				+ "  5. Salir                             \n"
                                + " Por favor Digite una opción           \n"
				+ " --------------------------------------\n"));
                try{
                    op = Byte.parseByte(JOptionPane.showInputDialog(menu));
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "ERROR : Debe ingresar un caracter númerico entero");
                }
                switch (menu) {
                case 1:
                   
                    break;
                }
               
            }while (op != 5);
    }
}


