/**
 * ProductFactory.java
 * this is the ProductFactory Java class for building products
 * @author Mdumisi Kelvin Letsie - 220120137
 * 11.03.2023
 */

package za.ac.cput.factory;

import za.ac.cput.domain.Product;
import za.ac.cput.util.Helper;

public class ProductFactory {
    public static Product createProduct(String productName, Double productPrice, String productCategory, String productBrand) {
        if (Helper.isNullOrEmpty(productName) || Helper.isNullOrEmpty(productCategory) || Helper.isNullOrEmpty(productBrand)) {
            return null;
        }

        String productId = Helper.generateId();
        boolean inStock = Helper.checkStock();

        Product product = new Product.Builder()
                .setProductID(productId)
                .setProductName(productName)
                .setProductPrice(productPrice)
                .setProductCategory(productCategory)
                .setProductBrand(productBrand)
                .setInStock(inStock)
                .build();

        return product;
    }
}
