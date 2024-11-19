package com.e_commerce.e_commerce.repository;

import com.e_commerce.e_commerce.entities.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponRespository extends JpaRepository<Coupon, Long> {

}
