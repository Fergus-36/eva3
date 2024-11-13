/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_arreglos_mult;

/**
 *
 * @author Alondra
 */
public class Eva3_8_arreglos_mult {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int [][][] cubo = new int [2][5][3];

        for (int i = 0; i < 2; i++) {//primer dimensopn
            for (int j = 0; j < 5; j++) {//segunada dimension 
                for (int k = 0; k < 3; k++) {// tercera dimension 
                  
                   cubo [i][j][k]=(int)(Math.random()*10);//esto es un casting le quita el valor de punto decimal al Math
                }
            }
        }
      for (int i = 0; i < 2; i++) {//primer dimensopn
            for (int j = 0; j < 5; j++) {//segunada dimension 
                for (int k = 0; k < 3; k++) {// tercera dimension 
                     System.out.println("["+ cubo [i][j][k]+"]"); 
                  
                }
            }
        }   
        
        
    }
    
  
}
