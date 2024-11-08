/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_3_2_valorretorno;

/**
 *
 * @author Alondra
 */
public class Eva_3_2_valorRetorno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //necestias el valor para poder hacer algo con el
       int resu;
       resu=sumarDosNum(5,10);
        System.out.println("resultado="+resu);
        //segundo
        System.out.println("resultado="+sumarDosNum(5,10));
       //no les interesa el resultado 
       sumarDosNum(100,200);//el resultqdo se pierde 
        
    }

    public static int sumarDosNum(int num1, int num2){
       //si es int siempre se agrega return
        return num1+num2;
    

        
    }

}
