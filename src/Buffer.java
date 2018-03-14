
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabri
 */
public class Buffer {
    private char buffer;
    
    Buffer() {
        this.buffer = 0;
    }
    
    synchronized char consume() {
        char product = 0;
        
        if (product == 0) {
            try {
                wait(1000);
            } catch(InterruptedException e) {
                Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        
        product = this.buffer;
        this.buffer = 0;
        notify();
        
        return product;
    }
    
    synchronized void produce(char product) {
        if (this.buffer != 0) {
               try {
                wait(1000);
            } catch(InterruptedException e) {
                Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        
        this.buffer = product;
        
        notify();
    }
}
