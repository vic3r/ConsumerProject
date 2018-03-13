/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabri
 */
public class ProducerConsumer {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        
        Producer producer = new Producer(buffer);
        producer.start();
        
        Consumer consumer = new Consumer(buffer);
        consumer.start();
    }
}
