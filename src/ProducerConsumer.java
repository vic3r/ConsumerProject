
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class ProducerConsumer {
    
    private JFrame frame;
    private JPanel panel;
    private JButton btProduce;
    private JButton btConsume;
    private JLabel produceLabel;
    private JLabel consumeLabel;
    
    public ProducerConsumer() {
        createComponents();
        setComponentsFeatures();
        addComponents();
        setFrameFeatures();      

    }
    
    public void createComponents() {
        frame = new JFrame("Producer Consumer");    
        panel = new JPanel();  
        btProduce = new JButton("Produce"); 
        btConsume = new JButton("Consume");
        produceLabel = new JLabel();
        consumeLabel = new JLabel();
    }
    
    public void setComponentsFeatures() {
        panel.setBounds(0,0,500,500);    
        panel.setBackground(Color.gray); 
        btProduce.setBounds(50,100,80,30);   
        btProduce.setBackground(Color.blue); 
        produceLabel.setBounds(50, 150, 50, 50);
        btConsume.setBounds(100,100,80,30);  
        consumeLabel.setBounds(100, 150, 50 , 50);
        btConsume.setBackground(Color.green);
    }
    
    public void addComponents(){
        this.panel.add(btProduce); 
        this.panel.add(btConsume); 
        this.frame.add(panel);
    }
    
    public void setFrameFeatures() {
        frame.setSize(500,500);    
        frame.setLayout(null);    
        frame.setVisible(true);
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
