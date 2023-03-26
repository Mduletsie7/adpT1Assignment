/**
 * Product.java
 * this is the Product POJO Java class
 * @author Mdumisi Kelvin Letsie - 220120137
 * 11.03.2023
 */

package za.ac.cput.domain;

import java.util.Objects;

public class Product {
    private String productID;
    private String productName;
    private Double productPrice;
    private String productCategory;
    private String productBrand;
    private Boolean inStock;

    public Product() {}

    // Add private constructor

    private Product(Builder builder) {
        this.productID = builder.productID;
        this.productName = builder.productName;
        this.productPrice = builder.productPrice;
        this.productCategory = builder.productCategory;
        this.productBrand = builder.productBrand;
        this.inStock = builder.inStock;
    }

    // Product Getters
    public String getProductID() {
        return  productID;
    }
    public String getProductName() {
        return productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public Boolean getInStock() {
        return inStock;
    }

    public static class Builder {
        private String productID;
        private String productName;
        private Double productPrice;
        private String productCategory;
        private String productBrand;
        private Boolean inStock;


        // Product Setters
        public Builder setProductID(String productID) {
            this.productID = productID;
            return this;
        }

        public Builder setProductName(String productName) {
            this.productName = productName;
            return this;
        }

        public Builder setProductPrice(Double productPrice) {
            this.productPrice = productPrice;
            return this;
        }

        public Builder setProductCategory(String productCategory) {
            this.productCategory = productCategory;
            return this;
        }

        public Builder setProductBrand(String productBrand) {
            this.productBrand = productBrand;
            return this;
        }

        public Builder setInStock(Boolean inStock) {
            this.inStock = inStock;
            return this;
        }

        public Builder copy(Product product) {
            this.productID = product.productID;
            this.productName = product.productName;
            this.productPrice = product.productPrice;
            this.productCategory = product.productCategory;
            this.productBrand = product.productBrand;
            this.inStock = product.inStock;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productID, product.productID) && Objects.equals(productName, product.productName) && Objects.equals(productPrice, product.productPrice) && Objects.equals(productCategory, product.productCategory) && Objects.equals(productBrand, product.productBrand) && Objects.equals(inStock, product.inStock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productID, productName, productPrice, productCategory, productBrand, inStock);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID='" + productID + '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productCategory='" + productCategory + '\'' +
                ", productBrand='" + productBrand + '\'' +
                ", inStock=" + inStock +
                '}';
    }

    public int compareProductName(String productName, String productName2) {
        return this.productName.compareTo(productName2);
    }


}

