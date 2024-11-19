package com.e_commerce.e_commerce.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Getter
@Setter
public class CartWiseCoupon extends Coupon {
    @Column(nullable = false)
    private int threshold;

    @Column(nullable = false)
    private double discount;
}
