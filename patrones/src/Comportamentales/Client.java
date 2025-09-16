/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comportamentales;

/**
 *
 * @author brian
 */
public class Client {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        Subscriber s1 = new ConcreteSubscriber("brian");
        Subscriber s2 = new ConcreteSubscriber("pedro");
        Subscriber s3 = new ConcreteSubscriber("jorge");

        publisher.subscribe(s1);
        publisher.subscribe(s2);
        publisher.subscribe(s3);

        publisher.mainBusinessLogic("game 1 win millwake");
        publisher.mainBusinessLogic("game 1 win golden state warrior");

        publisher.unsubscribe(s1);
        publisher.unsubscribe(s2);
        publisher.unsubscribe(s3);
        
       
        publisher.subscribe(s1);
        publisher.subscribe(s2);
        publisher.subscribe(s3);
        
        publisher.mainBusinessLogic("game 1 win millwake");
        publisher.mainBusinessLogic("game 1 win golden state warrior");
        
        publisher.mainBusinessLogic("Final game win...");
    }
}
