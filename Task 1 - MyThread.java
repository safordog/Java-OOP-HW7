/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework7;

import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author safordog
 */
public class MyThread implements Runnable {
    private Ship ship;
    private Port dock;
    
    public MyThread(Ship ship, Port dock) {
        this.ship = ship;
        this.dock = dock;
    }
    
    public MyThread() {
        
    }

    @Override
    public void run() {
        synchronized(dock) {
        System.out.println(dock.getName() + " " + "is starting unload " + ship.getShipName() + "..."); 
        try {
            Thread.sleep(5000);
        }   catch (InterruptedException ex) {
                Logger.getLogger(Port.class.getName()).log(Level.SEVERE, null, ex);
            }
        System.out.println(dock.getName() + " " + "ended unload " + ship.getShipName());
    }
    }
    
}
