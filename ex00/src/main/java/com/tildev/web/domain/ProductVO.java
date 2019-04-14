/**
 * 
 */
package com.tildev.web.domain;

/**
 * @author tildev
 * @date 2019. 4. 15.
 */
public class ProductVO {

    private String name;

    private double price;

    public ProductVO() {
        super();
    }

    /**
     * @param name
     * @param price
     */
    public ProductVO(String name, double price) {
        super();
        this.name = name;
        this.price = price;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductVO [name=" + name + ", price=" + price + "]";
    }

}
