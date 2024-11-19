package com.e_commerce.e_commerce.entities;

import com.e_commerce.e_commerce.enums.CouponType;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Coupon {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(nullable = false)
   @Enumerated(value = EnumType.STRING)
   private CouponType couponType;

   @Temporal(TemporalType.DATE)
   @Column(nullable = false)
   private Date startDate;

   @Temporal(TemporalType.DATE)
   @Column(nullable = false)
   private Date endDate;

   @Column(nullable = false)
   private boolean isActive;
}
