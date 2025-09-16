/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructurales;

/**
 *
 * @author brian
 */
    public class Main {
    public static void main(String[] args) {
       
        ClientPayment payment1 = new CreditCardAdapter("5238 2837127 1232" , "756");
        payment1.pay(150.0);
        

       

        
        ClientPayment payment2 = new PaypalAdapter("brian@email.com");
        payment2.pay(200.0);

       

        
        ClientPayment payment3 = new CryptoAdapter("TCDaXRD4XaNWxDoSgCy5dJrjiemjWy");
        payment3.pay(300.0);
    }
}


