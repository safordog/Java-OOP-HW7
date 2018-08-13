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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Port port = new Port();
        Port dockOne = new Port("Dock 1");
        Port dockTwo = new Port("Dock 2");
        Ship first = new Ship("NK-01", 10);
        Ship second = new Ship("NK-02", 10);
        Ship third = new Ship("NK-03", 10);
            port.unload(first, dockOne);
            port.unload(second, dockTwo);
            port.unload(third, dockOne);
          
    }
    
}
