/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructurales;

/**
 *
 * @author brian
 */
public class PaypalAdapter implements ClientPayment {
    private PaypalService paypalService;
    private String email;

    public PaypalAdapter(String email) {
        this.paypalService = new PaypalService();
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        paypalService.sendPayment(amount, email);
    }
}
