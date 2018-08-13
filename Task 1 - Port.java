/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework7;

/**
 *
 * @author safordog
 */
public class Port {
    private String name;
    
    public Port(String name) {
        this.name = name;
    }
    
    public Port() {
        
    }
    
    public void unload(Ship ship, Port dock) {
        Thread unloading = new Thread(new MyThread(ship, dock));
        unloading.start();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
      
     
}
