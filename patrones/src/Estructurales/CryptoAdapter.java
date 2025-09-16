/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructurales;

/**
 *
 * @author brian
 */
public class CryptoAdapter implements ClientPayment {
    private CryptoPay cryptoService;
    private String wallet;

    public CryptoAdapter(String wallet) {
        this.cryptoService = new CryptoPay();
        this.wallet = wallet;
    }

    @Override
    public void pay(double amount) {
        cryptoService.transferCrypto(amount, wallet);
    }
}
