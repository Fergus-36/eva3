/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_metodos;



/**
 *
 * @author Alondra
 */
public class Eva3_4_metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(capturaDia(1));
              
        //System.out.println(encontrarMayor(10,15));
    }
    //valor mas grande entre dos numeros enteros
   // public static int encontrarMayor(int num1, int num2){
    /*int resu;    
    if (num1 > num2)
    resu=num1;
    else 
        resu=num2;
    return  resu;//termina el metodo
    
    
    }*/
    
    /*if (num1>num2){
return num1;
}else
    return num2;
    */
    
    public static  int capturaDias(int dia){
        
    if(dia ==1){
    System.out.println("lunes");
    }
    else if(dia==2){
        System.out.println("martes");
    } else if(dia==2){
        System.out.println("miercoles");
    } else if(dia==3){
        System.out.println("jueves");
    } else if(dia==4){
        System.out.println("sabado");
    } else if(dia==5){
        System.out.println("domingo");
    } else if(dia==6){
        System.out.println("martes");
    } else if(dia==7){
        System.out.println("martes");
    } else if(dia<8){
        System.out.println("no compatible");
    }
    
        
        return 0;
    
    
    }

    private static boolean capturaDia(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}





