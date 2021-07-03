package com.sda.andreanaghi.startup.model.car;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "product_date")
    private Date productDate;

    @Column(name = "hp")
    private String hp;


    @Enumerated(EnumType.STRING)
    @Column(name = "car_type")
    private CarType carType;

    public Car() {
    }

    public Car(Long id, String brand, String model, Date productDate, String hp, CarType carType) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.productDate = productDate;
        this.hp = hp;
        this.carType = carType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getProductDate() {
        return productDate;
    }

    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productDate=" + productDate +
                ", hp='" + hp + '\'' +
                ", carType=" + carType +
                '}';
    }
}
