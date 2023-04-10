package com.example.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.aspectj.weaver.ast.Or;

@Entity
@Getter
@Setter
public class Delivery {

    @Id
    @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    @OneToOne(mappedBy = "delivery" ,fetch = FetchType.LAZY)
    private Order order;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING) // EumType시 디폴트 값인 ORDINAL 일경우 enum 순서대로 1번 2번 이된다 나중에 수정을 대비하여 STRING 타입만 쓰자
    private DeliberyStatus status; // READY, COMP
}

