import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerOrderTest {

private CustomerOrder order;
private Inventory inventory;

@Before
public void setUp() {
    order = new CustomerOrder();
    inventory = new Inventory();

    // Initialize the inventory with some items
    inventory.addItem("Pepperoni Pizza", 10);
    inventory.addItem("Cheese Pizza", 8);
    inventory.addItem("Garlic Bread", 15);
}

// ToDo: Test placing a valid order
    // Add items to the order, verify the number of items, and check if the total cost is calculated correctly.

    @Test
    public void testPlaceOrder() {
        order.addItem("Pepperoni Pizza", 12.50);
        order.addItem("Garlic Bread", 5.00);
        assertEquals(2, order.getItems().size());
        assertEquals(17.50, order.getTotalAmount(), 0.01);
    }

    // ToDo: Test paying for the order
    // Add an item to the order, pay using a method, and verify that the order is marked as paid.

    @Test
    public void testPayOrder() {
        order.addItem("Cheese Pizza", 10.00);
        order.pay("Credit Card");
        assertTrue(order.isPaid());
        assertEquals(10.00, order.getTotalAmount(), 0.01);
    }

    // ToDo: Test inventory update when an order is placed
    // Add an item to the order and reduce its stock. Verify that the inventory count is updated correctly.

    @Test
    public void testInventoryUpdate() {
        order.addItem("Pepperoni Pizza", 12.50);
        inventory.updateStock("Pepperoni Pizza", 1);
        assertEquals(9, inventory.getItemStock("Pepperoni Pizza"));
    }
}

