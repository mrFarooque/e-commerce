package com.e_commerce.e_commerce.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Getter
@Setter
@Table(name = "buy_x_get_y_wise_coupon")
public class BuyXGetYWiseCoupon extends Coupon {
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "buy_x_get_y_buy_products", // Join table for "buy" products
            joinColumns = @JoinColumn(name = "id"), // Foreign key to BuyXGetYWiseCoupon
            inverseJoinColumns = @JoinColumn(name = "product_id") // Foreign key to TransactionProduct
    )
    private List<TransactionProduct> buyProducts;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "buy_x_get_y_get_products", // Join table for "buy" products
            joinColumns = @JoinColumn(name = "id"), // Foreign key to BuyXGetYWiseCoupon
            inverseJoinColumns = @JoinColumn(name = "product_id") // Foreign key to TransactionProduct
    )
    private List<TransactionProduct> getProducts;

    private int repetitionLimit;
}
