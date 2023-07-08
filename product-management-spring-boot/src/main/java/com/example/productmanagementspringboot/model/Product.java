package com.example.productmanagementspringboot.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

public class Product extends CommmonAttributes{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String productName;

    private String brand;
    private String category;
    private double price;
    private String description;
    private int quantity;
    private boolean inStock;
    private String manufacturer;

    private Date dateOfManufacture;

    private Integer warrenty;

    private Integer gurrenty;



    public Product() {
    }


    public Product(String createdBy, Date createdOn, String updatedBy, Date updatedOn, Long id) {
        super(createdBy, createdOn, updatedBy, updatedOn);
        this.id = id;
        this.productName = productName;
        this.brand = brand;
        this.category = category;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
        this.inStock = inStock;
        this.manufacturer = manufacturer;
        this.dateOfManufacture = dateOfManufacture;
        this.warrenty = warrenty;
        this.gurrenty = gurrenty;

    }

    public Product(Long id, String productName, String brand, String category, double price, String description, int quantity, boolean inStock, String manufacturer, Date dateOfManufacture, Integer warrenty, Integer gurrenty) {
        this.id = id;
        this.productName = productName;
        this.brand = brand;
        this.category = category;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
        this.inStock = inStock;
        this.manufacturer = manufacturer;
        this.dateOfManufacture = dateOfManufacture;
        this.warrenty = warrenty;
        this.gurrenty = gurrenty;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Date getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(Date dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public Integer getWarrenty() {
        return warrenty;
    }

    public void setWarrenty(Integer warrenty) {
        this.warrenty = warrenty;
    }

    public Integer getGurrenty() {
        return gurrenty;
    }

    public void setGurrenty(Integer gurrenty) {
        this.gurrenty = gurrenty;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", brand='" + brand + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", inStock=" + inStock +
                ", manufacturer='" + manufacturer + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", warrenty=" + warrenty +
                ", gurrenty=" + gurrenty +
                '}';
    }
}
