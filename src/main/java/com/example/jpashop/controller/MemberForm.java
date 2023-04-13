package com.example.jpashop.controller;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberForm {
    @NotEmpty(message = "회원 이름은 필수 입니다.") // 변수가 비어있으면 출력되는 오류
    private String name;

    private String city;
    private String street;
    private String zipcode;

}
