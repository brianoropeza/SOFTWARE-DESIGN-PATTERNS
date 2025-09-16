/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructurales;

/**
 *
 * @author brian
 */
public class CreditCardAdapter implements ClientPayment {
    private CreditCardService creditCardService;
    private String cardInfo;
    private String cvc ;
    
    public CreditCardAdapter(String cardInfo, String cvc) {
        this.creditCardService = new CreditCardService();
        this.cardInfo = cardInfo;
        this.cvc = cvc;
    }
    
    

    @Override
    public void pay(double amount) {
        creditCardService.processCreditCard(amount, cardInfo, cvc);
    }
}

