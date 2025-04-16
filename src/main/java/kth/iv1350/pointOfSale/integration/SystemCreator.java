package kth.iv1350.pointOfSale.integration;

/**
 * This initializes the system of POS.
 */
public class SystemCreator {
    AccountingSystem accountingSystem = new AccountingSystem();
    InventorySystem inventorySystem = new InventorySystem();
    DiscountDatabase discountDatabase = new DiscountDatabase();
}
