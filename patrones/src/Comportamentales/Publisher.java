/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comportamentales;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author brian
 */
public class Publisher {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String mainState;

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println("New subscriber added.");
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println("Subscriber removed." );
    }

    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(mainState);
        }
    }

    public void mainBusinessLogic(String newState) {
        this.mainState = newState;
        System.out.println("Publisher changed state to: " + mainState);
        notifySubscribers();
    }  
}
