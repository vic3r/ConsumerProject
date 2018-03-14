
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 */
public class ProducerConsumer {

    public ProducerConsumer() {
        JFrame f = new JFrame("Producer Consumer");    
        JPanel panel = new JPanel();  
        panel.setBounds(0,0,600,800);    
        panel.setBackground(Color.gray);  
        JButton btProduce = new JButton("Produce");     
        btProduce.setBounds(50,100,80,30);    
        btProduce.setBackground(Color.blue);   
        JButton btConsume = new JButton("Consume");   
        btConsume.setBounds(100,100,80,30);    
        btConsume.setBackground(Color.green);   
        panel.add(btProduce); panel.add(btConsume);  
        f.add(panel);  
        f.setSize(600,800);    
        f.setLayout(null);    
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        
        ProducerConsumer produceConsumer = new ProducerConsumer();
        
        Producer producer = new Producer(buffer);
        producer.start();
        
        Consumer consumer = new Consumer(buffer);
        consumer.start();
    }
}
