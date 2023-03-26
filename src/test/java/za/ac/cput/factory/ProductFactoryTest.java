/**
 * Product.java
 * this is the ProductFactoryTest Java class for Unit Testing
 * @author Mdumisi Kelvin Letsie - 220120137
 * 11.03.2023
 */

package za.ac.cput.factory;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Product;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
class ProductFactoryTest {

    // i. Object Equality Test
    @Test
    public void test_ProductEquality() {
        Product product = new Product();
        Product myProduct = ProductFactory.createProduct("Samsung Galaxy S21FE 5G", 284.99, "Smart Phones", "Samsung");
        String productName = myProduct.getProductName().toString();
        assertEquals(productName, "Google Pixel 6A");
    }

    // ii. Object Identity Test
    @Test
    public void test_ObjectIdentity() {
        Product product = new Product();
        Product myProduct1 = ProductFactory.createProduct("Samsung Galaxy S21FE 5G", 284.99, "Smart Phones", "Samsung");
        Product myProduct2 =  myProduct1;
        Product myProduct3 = ProductFactory.createProduct("Iphone 14 Pro", 394.99, "Smart Phones", "Apple");

        assertSame(myProduct1, myProduct3);
    }

    // iii. Product build Failing TEST
    @Test
    public void test_fail() {
        Product product = ProductFactory.createProduct("Samsung Galaxy S21FE 5G", 284.99, "Smart Phones", "");
        assertNotNull(product);
        System.out.println(product.toString());
    }

    // iv. Timeout Test
    @Test
    void test_TimeOut() {
        assertTimeout(Duration.ofMillis(100), () -> {
            Thread.sleep(2000);

            System.out.println("Execution exceeded timeout duration!");
        });
    }

    // v. Disabling Test
    @Disabled("TODO: Still need to code this method")
    @Test
    public void test_productInTransit() {
    }

}