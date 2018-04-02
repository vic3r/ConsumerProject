
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
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
    private JLabel bufferSize;
    private JLabel rangeBufferSize;
    
    public ProducerConsumer() {
        createComponents();
        setComponentsFeatures();
        addComponents();
        setFrameFeatures();      

    }
    
    public void createComponents() {
        frame = new JFrame("Producer Consumer");    
        panel = new JPanel();  
        btProduce = new JButton("Producer"); 
        btConsume = new JButton("Consumer");
        produceLabel = new JLabel("Producers");
        consumeLabel = new JLabel("Consumers");
        bufferSize = new JLabel("Buffer size");
        rangeBufferSize = new JLabel("Range buffer size");
    }
    
    public void setComponentsFeatures() {
        panel.setBounds(0,0,500,500);
        panel.setBackground(Color.gray); 
        btProduce.setBounds(50,100,80,30);   
        btProduce.setBackground(Color.blue); 
        produceLabel.setBounds(20, 100, 100, 50);
        btConsume.setBounds(100,100,80,30);  
        consumeLabel.setBounds(20, 150, 100 , 50);
        btConsume.setBackground(Color.green);
    }
    
    public void addComponents(){
        this.panel.setLayout(null);
        this.panel.add(btProduce); 
        this.panel.add(btConsume); 
        this.panel.add(produceLabel);
        this.panel.add(consumeLabel);
        this.frame.add(panel);
    }
    
    public void setFrameFeatures() {
        frame.setSize(500,500);    
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
    }  
    
    public static void main(String[] args) {
        
        ProducerConsumer produceConsumer = new ProducerConsumer();
   //     Buffer buffer = new Buffer();
        
//        
//        Producer producer = new Producer(buffer);
//        producer.start();
//        
//        Consumer consumer = new Consumer(buffer);
//        consumer.start();
    }
}
