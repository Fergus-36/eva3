/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_5_metodos_arreglos;

/**
 *
 * @author Alondra
 */
public class Eva3_5_metodos_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String diasSeman[] = {"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
       imprimirArreglo(diasSeman);
       
        String meses[]={"enero","febrero","marzo","abril"};
    imprimirArreglo(meses);  
    
    int billetes[]={20,50,100,200,500,1000};
    imprimirBillete(billetes);
    
       
    }
  
   
    //imprimir el arreglo
    public static void imprimirArreglo(String[] arreglo){
    for(int i=0; i < arreglo.length;i++)
       System.out.println(arreglo[i]); 
            
            
   }
     public static void imprimirBillete(int[] arreglo){
    for(int i=0; i < arreglo.length;i++)
       System.out.println(arreglo[i]); 
     }
    
    
    
}
