package kth.iv1350.pointOfSale.startUp;

import kth.iv1350.pointOfSale.integration.SystemCreator;
import kth.iv1350.pointOfSale.controller.Controller;
import kth.iv1350.pointOfSale.view.View;

/**
 * Starts the entire application. The main method.
 */

public class Main {
    /**
     * This main method starts the entire application.
     * @param args The application does not take any command line parameters.
     */
    public static void main (String[] args) {
        SystemCreator creater = new SystemCreator();
        Controller contr = new Controller();
        new View(contr);
    }
}