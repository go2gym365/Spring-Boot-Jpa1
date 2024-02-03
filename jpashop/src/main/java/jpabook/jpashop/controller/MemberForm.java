package jpabook.jpashop.controller;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MemberForm {
    
    @NotBlank(message = "회원 이름은 필수 입력 값입니다.")
    private String name;

    private String city;
    private String street;
    private String zipcode;
}
