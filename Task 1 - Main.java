/*
 * Существуют три корабля. На каждом из них 10 ящиков груза.
 * Они одновременно прибыли в порт, в котором только два
 * дока. Скорость разгрузки - 1 ящик в 0.5 сек. Напишите
 * программу, которая, управляя кораблями, позволит им
 * правильно разгрузить груз.
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
