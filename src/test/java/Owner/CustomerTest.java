package Owner;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    Customer customer;

    @Before
    public void setUp() throws Exception {
        customer = new Customer("John", 20);
    }

    @Test
    public void getName(){
        assertEquals("John", customer.getName());
    }

    @Test
    public void getMoney(){
        assertEquals(20, customer.getMoney());
    }

    @Test
    public void getCollection(){
        assertEquals(0, customer.getCollection().size());
    }

}