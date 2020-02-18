/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e1;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author adrian
 */
public class ObjetoRemoto extends UnicastRemoteObject implements InterfaceRemota{
    public ObjetoRemoto() throws RemoteException{
        super ();
    }

    @Override
    public double cuotaMensual(double capital, double interes, double plazo){
        System.out.println("Calculando cuota...");
        double plazoMes = plazo/ 12.00;
        double interesMes = interes / 12.00;
        return (capital * interes)/(100.00 * (1- (Math.pow(interesMes/100.00, plazoMes))));
    }    
    
}