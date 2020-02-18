package e1;

import java.rmi.*;
import java.text.*;

/**Implementación del cliente para RMI*/

public class Cliente{
    //creamos nueva instancia del cliente

    public Cliente(){
        try{
            InterfaceRemota objetoRemoto = (InterfaceRemota)Naming.lookup("//192.168.43.242/ObjetoRemoto");

            System.out.println("Capital: $20,000");
            System.out.println("Interes: 6%");
            System.out.println("plazo : 5 años");

            DecimalFormat df = new DecimalFormat("#,##");

            //Hacemos el cálculo remoto

            System.out.println("Cuota mensual :" +
            df.format(objetoRemoto.cuotaMensual(20000.00, 6.00, 5.00))
            + "pesos");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//Fin del contructor
    public static void main(String[] args) {
    new Cliente();
    }//Fin Main
    
}