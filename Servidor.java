/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package e1;

import java.rmi.*;

/*
Servidor para el ejemplo RMI
*/

public class Servidor{

//Crea una nueva instancia del servidor RMI
public Servidor(){
    try{
        //Se ha registrado el registro donde se encuentran las clases 
        System.setProperty(
            "java.rmi.server.CODEBASE",
            "C:/Users/Adrian/Documents/CODE/E1");
            

    
        
        //Se realiza publicación del objeto remoto// 

        InterfaceRemota objetoRemoto = new ObjetoRemoto();
        Naming.rebind("192.168.43.242", objetoRemoto); //<---- cambiar IP
        System.out.println("Servidor iniciando");


    }
    catch(Exception e){
        e.printStackTrace();
    }
}
//FIN DEL CONSTRUCTOR

 public static void main(String[] args) {
    new Servidor();
}//Fin Main

}
