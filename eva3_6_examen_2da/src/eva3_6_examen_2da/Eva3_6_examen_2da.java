/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_examen_2da;

import java.util.Scanner;

/**
 *
 * @author Alondra
 */
public class Eva3_6_examen_2da {
public static final int PIEDRA=1;
public static final int PAPEL=2;
public static final int TIJERA=3;

public static final int EMPATE=1;
public static final int GANA=2;
public static final int PIERDE=3;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int jugadaUsu;
        int jugadaCompu;
        int resuJugada;
do{
  jugadaUsu =capturaJugada ("introduce tu jugada (1-piedra, 2-papel, 3-tijera, 0-salir)");  
jugadaCompu= capturaCompu();
    System.out.println(jugadaCompu);
    resuJugada=evaluaJugada(jugadaUsu, jugadaCompu);
    System.out.println();
}while(jugadaUsu!=0);
        
        
    }
    //peedir al usuario
    public static  int capturaJugada(String mensaje ){
     Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        int resu = captu.nextInt();
        return resu;
       
      
    }
    // generar jugada de ña computadora
    public static int capturaCompu(){
    int resu;
    double valor= Math.random();
    
    if((valor>=0)&&(valor<0.3))
    resu=1;
    else if ((valor>=0.3)&&(valor<0.9))
        resu=2;
    else
        resu=3;
    return resu;
    }
    public static int evaluaJugada(int jugadaU, int JugadaC){
    //9 posibilidades
    int resu;
    if((jugadaU==PIEDRA)&& (JugadaC==PIEDRA))
    resu =EMPATE;
    else if((jugadaU==PIEDRA)&& (JugadaC==PAPEL))
    resu=GANA;
    else if((jugadaU==PIEDRA)&& (JugadaC==TIJERA))
    resu=GANA;
    else if((jugadaU==PAPEL)&& (JugadaC==PIEDRA))
    resu=2;
    else if((jugadaU==PAPEL)&& (JugadaC==PAPEL))
    resu=2;
    else if((jugadaU==PAPEL)&& (JugadaC==TIJERA))
    resu=2;
    else if((jugadaU==TIJERA)&& (JugadaC==PIEDRA))
    resu=2;
    else if((jugadaU==TIJERA)&& (JugadaC==PAPEL))
    resu=2;
     else if((jugadaU==TIJERA)&& (JugadaC==TIJERA))
    resu=2;
    else 
    return resu;
    }
        
}
