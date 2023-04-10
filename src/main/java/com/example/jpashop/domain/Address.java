package com.example.jpashop.domain;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;


// 값 타입 변경은 불가능하게 설계해야한다.
// 자바 기본생성자를 protected로 설계해서 호출되는것을 막아야한다.
// JPA가 기본생성자를 두는 이유는 객체를 생성할 때 리플랙션 같은 기술을 사용할수 있도록 지원하기 위함이다.
@Embeddable
@Getter
public class Address {
    private String city;
    private String street;
    private String zipcode;

    protected Address() {
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}
