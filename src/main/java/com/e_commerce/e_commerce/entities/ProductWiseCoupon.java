package com.e_commerce.e_commerce.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(callSuper = true)
@Entity
@Getter
@Setter
public class ProductWiseCoupon extends Coupon {
    @Column(nullable = false)
    private long productId;

    @Column(nullable = false)
    private double discount;
}
