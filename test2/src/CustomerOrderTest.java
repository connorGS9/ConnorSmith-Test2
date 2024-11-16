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

}

