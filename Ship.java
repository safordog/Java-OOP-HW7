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
public class Ship {
    
    private String shipName;
    private int cargo;
    
    public Ship(String shipName, int cargo) {
        this.shipName = shipName;
        this.cargo = cargo;
    }
    
    public Ship() {
        
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }
    
}
